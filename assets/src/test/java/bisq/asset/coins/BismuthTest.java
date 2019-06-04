/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;
import org.junit.Test;

public class BismuthTest extends AbstractAssetTest {

    public BismuthTest() {
        super(new Bismuth());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("e13e79dc7e4b8265d7cdafe31819939fcce98abc2c7662f7fb53fa38");
        assertValidAddress("de98671db1ce0e5c9ba89ab7ccdca6c427460295b8dd3642e9b2bb96");
        assertValidAddress("952cfda35b32e2eac3e3431f566b80a0c47c6c512d3f283c1e57aee3");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("woHVYYZEBXB99yPP1AWNYYTDLPGHZ11jTia4RWRpwbohuChbpPngF42RCoaKaJciCmhwdKWsBBQPt8Ci5dr9p3BejTRxX");
        assertInvalidAddress("ywoHYYZEBXB99yPP1AWNYYTDLPGHZ11jTia4RWRpwbohuChbpPngF42RCoaKaJciCmhwdKWsBBQPt8Ci5dr9p3BejTRxXVV");
        assertInvalidAddress("kwoHEEBXB99yPP1AWNYYTDLPGHZ11jTia4RWRpwbohuChbpPngF42RCoaKaJciCmhwdKWsBBQPt8Ci5dr9p3BejTRxXVV");
        assertInvalidAddress("XizxdSDC6B4xwcxr6ZsHAiShnj7XcXSEmf4GQRTmpDFum1MyohsekDvRQpN4eQwyZyCw4Hs2UKyJSygXwA2QhyGcS5NRVsYrM9t2SCPsxzT");
        assertInvalidAddress("");
        assertInvalidAddress("XoHEJVYYZEBXB99yPP1AWNYYTDLPGHZ11jTia4RWRpwbohuChbpPngF42RCoaKaJciCmhwdKWsBBQPt8Ci5dr9p3BejTRxXV#aFejf");
        assertInvalidAddress("1jRo3rcp9fjdfjdSGpx");
        assertInvalidAddress("GARp92UtmTWDjZatG8sdurzouheiuRRRTbbRtbr3atrHSXr9vJzjHq2TfPrjateDz9Wc8ZJKuDayqJ$%");
        assertInvalidAddress("FxQ8Gv6xnvDhUrM57z71bfFvu9HeofXtXpZRLnrCN2s2cKvkQowrWjJTGz4676ymKvU4NzPY8Cadgsdhsdfhg4gfJwL2yhhkJ7");
    }
}
