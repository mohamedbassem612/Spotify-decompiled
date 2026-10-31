package p;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dz20 implements az20 {
    public final ha4 a;
    public final ha4 b;
    public final vy20 d;
    public ndn0 f;
    public d030 h;
    public final d030 c = new d030(2, 14, null);
    public final cz20 e = new cz20(this);
    public final wdn0 g = new wdn0(1);

    public dz20(ha4 ha4Var, ha4 ha4Var2) {
        this.a = ha4Var;
        this.b = ha4Var2;
        this.d = new vy20(this, ha4Var2);
    }

    public final void b(boolean z) {
        d(8, z, true);
    }

    public final boolean c(boolean z) {
        jdo0 jdo0Var;
        if (h() != null) {
            d030 d030VarH = h();
            k(null);
            if (d030VarH != null) {
                wz20 wz20Var = wz20.a;
                wz20 wz20Var2 = wz20.c;
                d030VarH.I1(wz20Var, wz20Var2);
                if (!d030VarH.a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0 pim0Var = d030VarH.a.e;
                hmb0 hmb0VarB = oap1.B(d030VarH);
                while (hmb0VarB != null) {
                    if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                        while (pim0Var != null) {
                            if ((pim0Var.c & 1024) != 0) {
                                pim0 pim0VarE = pim0Var;
                                bfn0 bfn0Var = null;
                                while (pim0VarE != null) {
                                    if (pim0VarE instanceof d030) {
                                        ((d030) pim0VarE).I1(wz20.b, wz20Var2);
                                    } else if ((pim0VarE.c & 1024) != 0 && (pim0VarE instanceof l5t)) {
                                        int i = 0;
                                        for (pim0 pim0Var2 = ((l5t) pim0VarE).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                            if ((pim0Var2.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    pim0VarE = pim0Var2;
                                                } else {
                                                    if (bfn0Var == null) {
                                                        bfn0Var = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarE != null) {
                                                        bfn0Var.b(pim0VarE);
                                                        pim0VarE = null;
                                                    }
                                                    bfn0Var.b(pim0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    pim0VarE = oap1.e(bfn0Var);
                                }
                            }
                            pim0Var = pim0Var.e;
                        }
                    }
                    hmb0VarB = hmb0VarB.v();
                    pim0Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean d(int i, boolean z, boolean z2) throws NoWhenBranchMatchedException {
        int iC;
        boolean z3 = true;
        if (z || (iC = l1d.C(m6p1.v(i, this.c))) == 0) {
            c(z);
        } else {
            if (iC != 1 && iC != 2 && iC != 3) {
                eg.o();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            e();
        }
        return z3;
    }

    public final void e() {
        ha4 ha4Var = this.a;
        if (ha4Var.isFocused() || ha4Var.hasFocus()) {
            ha4Var.clearFocus();
        } else if (ha4Var.hasFocus()) {
            View viewFindFocus = ha4Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            ha4Var.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0144 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x014a A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0188 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0198 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x019d  */
    /* JADX WARN: Code duplicated, block: B:330:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0191 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x017a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[ADDED_TO_REGION, LOOP:12: B:53:0x00a9->B:81:0x00f5, LOOP_START, PHI: r5
      0x00a9: PHI (r5v31 p.pim0) = (r5v25 p.pim0), (r5v32 p.pim0) binds: [B:52:0x00a7, B:81:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x010e A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0114 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x011a A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0127 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0133 A[ADDED_TO_REGION, LOOP:16: B:99:0x0133->B:127:0x017f, LOOP_START, PHI: r12
      0x0133: PHI (r12v14 p.pim0) = (r12v8 p.pim0), (r12v15 p.pim0) binds: [B:98:0x0131, B:127:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r12v25, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r12v29, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r12v30, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r12v34, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v41 */
    public final boolean f(KeyEvent keyEvent, Function0 function0) {
        pim0 pim0Var;
        hmb0 hmb0VarB;
        Object obj;
        Object obj2;
        pim0 pim0Var2;
        jdo0 jdo0Var;
        pim0 pim0VarE;
        bfn0 bfn0Var;
        pim0 pim0Var3;
        hmb0 hmb0VarB2;
        Object obj3;
        Object obj4;
        jdo0 jdo0Var2;
        bfn0 bfn0Var2;
        pim0 pim0VarE2;
        int size;
        jdo0 jdo0Var3;
        boolean z;
        d030 d030Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            long jR = ern1.r(keyEvent);
            int iT = ern1.t(keyEvent);
            if (crn1.m(iT, 2)) {
                ndn0 ndn0Var = this.f;
                if (ndn0Var == null) {
                    ndn0Var = new ndn0(3);
                    this.f = ndn0Var;
                }
                ndn0Var.d(jR);
            } else if (crn1.m(iT, 1)) {
                ndn0 ndn0Var2 = this.f;
                if (ndn0Var2 == null || !ndn0Var2.a(jR)) {
                    Trace.endSection();
                    return false;
                }
                ndn0 ndn0Var3 = this.f;
                if (ndn0Var3 != null) {
                    ndn0Var3.e(jR);
                }
            }
            d030 d030VarK = dm5.K(d030Var);
            if (d030VarK != null) {
                if (!d030VarK.a.N0) {
                    qf80.c("visitLocalDescendants called on an unattached node");
                }
                pim0 pim0Var4 = d030VarK.a;
                if ((pim0Var4.d & 9216) != 0) {
                    pim0Var2 = null;
                    for (pim0 pim0Var5 = pim0Var4.f; pim0Var5 != null; pim0Var5 = pim0Var5.f) {
                        int i = pim0Var5.c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            pim0Var2 = pim0Var5;
                        }
                    }
                } else {
                    pim0Var2 = null;
                }
                if (pim0Var2 == null) {
                    if (d030VarK == null) {
                        if (!d030Var.a.N0) {
                            qf80.c("visitAncestors called on an unattached node");
                        }
                        pim0Var = d030Var.a.e;
                        hmb0VarB = oap1.B(d030Var);
                        loop15: while (true) {
                            if (hmb0VarB != null) {
                                obj = null;
                                break;
                            }
                            if ((((pim0) hmb0VarB.e1.g).d & 8192) != 0) {
                                while (pim0Var != null) {
                                    if ((pim0Var.c & 8192) != 0) {
                                        pim0VarE = pim0Var;
                                        bfn0Var = null;
                                        while (pim0VarE != null) {
                                            if (pim0VarE instanceof hpa0) {
                                                obj = pim0VarE;
                                                break loop15;
                                            }
                                            if ((pim0VarE.c & 8192) == 0) {
                                            }
                                            pim0VarE = oap1.e(bfn0Var);
                                        }
                                    }
                                    pim0Var = pim0Var.e;
                                }
                            }
                            hmb0VarB = hmb0VarB.v();
                            if (hmb0VarB != null) {
                            }
                        }
                        obj2 = (hpa0) obj;
                        if (obj2 != null) {
                            pim0Var2 = ((pim0) obj2).a;
                        } else {
                            pim0Var2 = null;
                        }
                    } else {
                        if (!d030VarK.a.N0) {
                            qf80.c("visitAncestors called on an unattached node");
                        }
                        pim0Var3 = d030VarK.a;
                        hmb0VarB2 = oap1.B(d030VarK);
                        loop11: while (true) {
                            if (hmb0VarB2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((((pim0) hmb0VarB2.e1.g).d & 8192) != 0) {
                                while (pim0Var3 != null) {
                                    if ((pim0Var3.c & 8192) != 0) {
                                        bfn0Var2 = null;
                                        pim0VarE2 = pim0Var3;
                                        while (pim0VarE2 != null) {
                                            if (pim0VarE2 instanceof hpa0) {
                                                obj3 = pim0VarE2;
                                                break loop11;
                                            }
                                            if ((pim0VarE2.c & 8192) == 0) {
                                            }
                                            pim0VarE2 = oap1.e(bfn0Var2);
                                        }
                                    }
                                    pim0Var3 = pim0Var3.e;
                                }
                            }
                            hmb0VarB2 = hmb0VarB2.v();
                            if (hmb0VarB2 != null) {
                            }
                        }
                        obj4 = (hpa0) obj3;
                        if (obj4 != null) {
                            pim0Var2 = ((pim0) obj4).a;
                        } else {
                            if (!d030Var.a.N0) {
                                qf80.c("visitAncestors called on an unattached node");
                            }
                            pim0Var = d030Var.a.e;
                            hmb0VarB = oap1.B(d030Var);
                            loop15: while (true) {
                                if (hmb0VarB != null) {
                                    obj = null;
                                    break;
                                }
                                if ((((pim0) hmb0VarB.e1.g).d & 8192) != 0) {
                                    while (pim0Var != null) {
                                        if ((pim0Var.c & 8192) != 0) {
                                            pim0VarE = pim0Var;
                                            bfn0Var = null;
                                            while (pim0VarE != null) {
                                                if (pim0VarE instanceof hpa0) {
                                                    obj = pim0VarE;
                                                    break loop15;
                                                }
                                                if ((pim0VarE.c & 8192) == 0) {
                                                }
                                                pim0VarE = oap1.e(bfn0Var);
                                            }
                                        }
                                        pim0Var = pim0Var.e;
                                    }
                                }
                                hmb0VarB = hmb0VarB.v();
                                if (hmb0VarB != null) {
                                }
                            }
                            obj2 = (hpa0) obj;
                            if (obj2 != null) {
                                pim0Var2 = ((pim0) obj2).a;
                            } else {
                                pim0Var2 = null;
                            }
                        }
                    }
                }
            } else if (d030VarK == null) {
                if (!d030Var.a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0Var = d030Var.a.e;
                hmb0VarB = oap1.B(d030Var);
                loop15: while (true) {
                    if (hmb0VarB != null) {
                        obj = null;
                        break;
                    }
                    if ((((pim0) hmb0VarB.e1.g).d & 8192) != 0) {
                        while (pim0Var != null) {
                            if ((pim0Var.c & 8192) != 0) {
                                pim0VarE = pim0Var;
                                bfn0Var = null;
                                while (pim0VarE != null) {
                                    if (pim0VarE instanceof hpa0) {
                                        obj = pim0VarE;
                                        break loop15;
                                    }
                                    if ((pim0VarE.c & 8192) == 0 && (pim0VarE instanceof l5t)) {
                                        pim0 pim0Var6 = ((l5t) pim0VarE).P0;
                                        int i2 = 0;
                                        while (pim0Var6 != null) {
                                            if ((pim0Var6.c & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    pim0VarE = pim0VarE;
                                                    bfn0Var = bfn0Var;
                                                    bfn0Var = bfn0Var;
                                                    pim0VarE = pim0Var6;
                                                } else {
                                                    if (bfn0Var == null) {
                                                        bfn0Var = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarE != null) {
                                                        bfn0Var.b(pim0VarE);
                                                        pim0VarE = null;
                                                    }
                                                    bfn0Var.b(pim0Var6);
                                                }
                                            } else {
                                                pim0VarE = pim0VarE;
                                                bfn0Var = bfn0Var;
                                            }
                                            pim0Var6 = pim0Var6.f;
                                            pim0VarE = pim0VarE;
                                            bfn0Var = bfn0Var;
                                        }
                                        if (i2 == 1) {
                                            pim0VarE = pim0VarE;
                                            bfn0Var = bfn0Var;
                                        } else {
                                            pim0VarE = pim0VarE;
                                            bfn0Var = bfn0Var;
                                        }
                                    }
                                    pim0VarE = oap1.e(bfn0Var);
                                }
                            }
                            pim0Var = pim0Var.e;
                        }
                    }
                    hmb0VarB = hmb0VarB.v();
                    pim0Var = (hmb0VarB != null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                }
                obj2 = (hpa0) obj;
                if (obj2 != null) {
                    pim0Var2 = ((pim0) obj2).a;
                } else {
                    pim0Var2 = null;
                }
            } else {
                if (!d030VarK.a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0Var3 = d030VarK.a;
                hmb0VarB2 = oap1.B(d030VarK);
                loop11: while (true) {
                    if (hmb0VarB2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((((pim0) hmb0VarB2.e1.g).d & 8192) != 0) {
                        while (pim0Var3 != null) {
                            if ((pim0Var3.c & 8192) != 0) {
                                bfn0Var2 = null;
                                pim0VarE2 = pim0Var3;
                                while (pim0VarE2 != null) {
                                    if (pim0VarE2 instanceof hpa0) {
                                        obj3 = pim0VarE2;
                                        break loop11;
                                    }
                                    if ((pim0VarE2.c & 8192) == 0 && (pim0VarE2 instanceof l5t)) {
                                        pim0 pim0Var7 = ((l5t) pim0VarE2).P0;
                                        int i3 = 0;
                                        while (pim0Var7 != null) {
                                            if ((pim0Var7.c & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    pim0VarE2 = pim0VarE2;
                                                    bfn0Var2 = bfn0Var2;
                                                    bfn0Var2 = bfn0Var2;
                                                    pim0VarE2 = pim0Var7;
                                                } else {
                                                    if (bfn0Var2 == null) {
                                                        bfn0Var2 = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarE2 != null) {
                                                        bfn0Var2.b(pim0VarE2);
                                                        pim0VarE2 = null;
                                                    }
                                                    bfn0Var2.b(pim0Var7);
                                                }
                                            } else {
                                                pim0VarE2 = pim0VarE2;
                                                bfn0Var2 = bfn0Var2;
                                            }
                                            pim0Var7 = pim0Var7.f;
                                            pim0VarE2 = pim0VarE2;
                                            bfn0Var2 = bfn0Var2;
                                        }
                                        if (i3 == 1) {
                                            pim0VarE2 = pim0VarE2;
                                            bfn0Var2 = bfn0Var2;
                                        } else {
                                            pim0VarE2 = pim0VarE2;
                                            bfn0Var2 = bfn0Var2;
                                        }
                                    }
                                    pim0VarE2 = oap1.e(bfn0Var2);
                                }
                            }
                            pim0Var3 = pim0Var3.e;
                        }
                    }
                    hmb0VarB2 = hmb0VarB2.v();
                    pim0Var3 = (hmb0VarB2 != null || (jdo0Var2 = hmb0VarB2.e1) == null) ? null : (gpd1) jdo0Var2.f;
                }
                obj4 = (hpa0) obj3;
                if (obj4 != null) {
                    pim0Var2 = ((pim0) obj4).a;
                } else {
                    if (!d030Var.a.N0) {
                        qf80.c("visitAncestors called on an unattached node");
                    }
                    pim0Var = d030Var.a.e;
                    hmb0VarB = oap1.B(d030Var);
                    loop15: while (true) {
                        if (hmb0VarB != null) {
                            obj = null;
                            break;
                        }
                        if ((((pim0) hmb0VarB.e1.g).d & 8192) != 0) {
                            while (pim0Var != null) {
                                if ((pim0Var.c & 8192) != 0) {
                                    pim0VarE = pim0Var;
                                    bfn0Var = null;
                                    while (pim0VarE != null) {
                                        if (pim0VarE instanceof hpa0) {
                                            obj = pim0VarE;
                                            break loop15;
                                        }
                                        if ((pim0VarE.c & 8192) == 0) {
                                        }
                                        pim0VarE = oap1.e(bfn0Var);
                                    }
                                }
                                pim0Var = pim0Var.e;
                            }
                        }
                        hmb0VarB = hmb0VarB.v();
                        if (hmb0VarB != null) {
                        }
                    }
                    obj2 = (hpa0) obj;
                    if (obj2 != null) {
                        pim0Var2 = ((pim0) obj2).a;
                    } else {
                        pim0Var2 = null;
                    }
                }
            }
            if (pim0Var2 != null) {
                if (!pim0Var2.a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0 pim0Var8 = pim0Var2.a.e;
                hmb0 hmb0VarB3 = oap1.B(pim0Var2);
                ArrayList arrayList = null;
                while (hmb0VarB3 != null) {
                    if ((((pim0) hmb0VarB3.e1.g).d & 8192) != 0) {
                        while (pim0Var8 != null) {
                            if ((pim0Var8.c & 8192) != 0) {
                                pim0 pim0VarE3 = pim0Var8;
                                bfn0 bfn0Var3 = null;
                                while (pim0VarE3 != null) {
                                    if (pim0VarE3 instanceof hpa0) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(pim0VarE3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (pim0VarE3.c & 8192) != 0 && (pim0VarE3 instanceof l5t)) {
                                        int i4 = 0;
                                        for (pim0 pim0Var9 = ((l5t) pim0VarE3).P0; pim0Var9 != null; pim0Var9 = pim0Var9.f) {
                                            if ((pim0Var9.c & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    pim0VarE3 = pim0Var9;
                                                } else {
                                                    if (bfn0Var3 == null) {
                                                        bfn0Var3 = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarE3 != null) {
                                                        bfn0Var3.b(pim0VarE3);
                                                        pim0VarE3 = null;
                                                    }
                                                    bfn0Var3.b(pim0Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    pim0VarE3 = oap1.e(bfn0Var3);
                                }
                            }
                            pim0Var8 = pim0Var8.e;
                        }
                    }
                    hmb0VarB3 = hmb0VarB3.v();
                    pim0Var8 = (hmb0VarB3 == null || (jdo0Var3 = hmb0VarB3.e1) == null) ? null : (gpd1) jdo0Var3.f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((hpa0) arrayList.get(size)).x0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? E = pim0Var2.a;
                ?? bfn0Var4 = 0;
                while (E != 0) {
                    if (E instanceof hpa0) {
                        if (((hpa0) E).x0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E.c & 8192) != 0 && (E instanceof l5t)) {
                        pim0 pim0Var10 = ((l5t) E).P0;
                        int i6 = 0;
                        while (pim0Var10 != null) {
                            if ((pim0Var10.c & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    bfn0Var4 = bfn0Var4;
                                    E = E;
                                    bfn0Var4 = bfn0Var4;
                                    E = pim0Var10;
                                } else {
                                    if (bfn0Var4 == 0) {
                                        bfn0Var4 = new bfn0(0, new pim0[16]);
                                    }
                                    if (E != 0) {
                                        bfn0Var4.b(E);
                                        E = 0;
                                    }
                                    bfn0Var4.b(pim0Var10);
                                }
                            } else {
                                bfn0Var4 = bfn0Var4;
                                E = E;
                            }
                            pim0Var10 = pim0Var10.f;
                            bfn0Var4 = bfn0Var4;
                            E = E;
                        }
                        if (i6 == 1) {
                            bfn0Var4 = bfn0Var4;
                            E = E;
                        } else {
                            bfn0Var4 = bfn0Var4;
                            E = E;
                        }
                    }
                    E = oap1.e((bfn0) bfn0Var4);
                }
                if (((Boolean) function0.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? E2 = pim0Var2.a;
                ?? bfn0Var5 = 0;
                while (E2 != 0) {
                    if (E2 instanceof hpa0) {
                        if (((hpa0) E2).J0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E2.c & 8192) != 0 && (E2 instanceof l5t)) {
                        pim0 pim0Var11 = ((l5t) E2).P0;
                        int i7 = 0;
                        while (pim0Var11 != null) {
                            if ((pim0Var11.c & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    E2 = E2;
                                    bfn0Var5 = bfn0Var5;
                                    bfn0Var5 = bfn0Var5;
                                    E2 = pim0Var11;
                                } else {
                                    if (bfn0Var5 == 0) {
                                        bfn0Var5 = new bfn0(0, new pim0[16]);
                                    }
                                    if (E2 != 0) {
                                        bfn0Var5.b(E2);
                                        E2 = 0;
                                    }
                                    bfn0Var5.b(pim0Var11);
                                }
                            } else {
                                E2 = E2;
                                bfn0Var5 = bfn0Var5;
                            }
                            pim0Var11 = pim0Var11.f;
                            E2 = E2;
                            bfn0Var5 = bfn0Var5;
                        }
                        if (i7 == 1) {
                            E2 = E2;
                            bfn0Var5 = bfn0Var5;
                        } else {
                            E2 = E2;
                            bfn0Var5 = bfn0Var5;
                        }
                    }
                    E2 = oap1.e((bfn0) bfn0Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((hpa0) arrayList.get(i8)).J0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0209 A[LOOP:2: B:97:0x01ab->B:127:0x0209, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0216  */
    /* JADX WARN: Code duplicated, block: B:134:0x021a  */
    /* JADX WARN: Code duplicated, block: B:229:0x020c A[EDGE_INSN: B:229:0x020c->B:128:0x020c BREAK  A[LOOP:1: B:92:0x0195->B:235:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0156  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:85:0x016b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code duplicated, block: B:90:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0192  */
    /* JADX WARN: Code duplicated, block: B:94:0x0199  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ad  */
    public final Boolean g(int i, n511 n511Var, iu30 iu30Var) throws NoWhenBranchMatchedException {
        jdo0 jdo0Var;
        lz20 lz20VarP;
        lz20 lz20VarG;
        lz20 lz20VarN;
        lz20 lz20VarO;
        Object[] objArr;
        int i2;
        int i3;
        boolean z;
        Object obj;
        bfn0 bfn0Var;
        pim0 pim0Var;
        pim0 pim0Var2;
        int i4;
        pim0 pim0VarE;
        bfn0 bfn0Var2;
        d030 d030VarK;
        d030 d030Var = this.c;
        d030 d030VarK2 = dm5.K(d030Var);
        int i5 = 4;
        ha4 ha4Var = this.b;
        d030 d030Var2 = null;
        boolean zBooleanValue = false;
        if (d030VarK2 != null) {
            flb0 layoutDirection = ha4Var.getLayoutDirection();
            gz20 gz20VarJ1 = d030VarK2.J1();
            if (yx20.b(i, 1)) {
                lz20VarN = gz20VarJ1.j();
            } else if (yx20.b(i, 2)) {
                lz20VarN = gz20VarJ1.m();
            } else if (yx20.b(i, 5)) {
                lz20VarN = gz20VarJ1.p();
            } else if (yx20.b(i, 6)) {
                lz20VarN = gz20VarJ1.f();
            } else {
                if (!yx20.b(i, 3)) {
                    if (yx20.b(i, 4)) {
                        int iOrdinal = layoutDirection.ordinal();
                        if (iOrdinal == 0) {
                            lz20VarG = gz20VarJ1.g();
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            lz20VarG = gz20VarJ1.o();
                        }
                        lz20 lz20Var = lz20.b;
                        lz20VarN = lz20VarG == j6p1.p() ? null : lz20VarG;
                        if (lz20VarN == null) {
                            lz20VarN = gz20VarJ1.n();
                        }
                    } else {
                        if (!yx20.b(i, 7) && !yx20.b(i, 8)) {
                            eg.m("invalid FocusDirection");
                            return null;
                        }
                        dgd dgdVar = new dgd(i, 0);
                        dz20 dz20Var = (dz20) ((ha4) oap1.C(d030VarK2)).getFocusOwner();
                        d030 d030VarH = dz20Var.h();
                        if (yx20.b(i, 7)) {
                            gz20VarJ1.k().invoke(dgdVar);
                        } else {
                            gz20VarJ1.l().invoke(dgdVar);
                        }
                        if (dgdVar.a()) {
                            lz20 lz20Var2 = lz20.b;
                            lz20VarP = j6p1.o();
                        } else if (d030VarH != dz20Var.h()) {
                            lz20 lz20Var3 = lz20.b;
                            lz20VarP = j6p1.r();
                        } else {
                            lz20 lz20Var4 = lz20.b;
                            lz20VarP = j6p1.p();
                        }
                    }
                    lz20 lz20Var5 = lz20.b;
                    if (!u890.j(lz20VarP, j6p1.o())) {
                        if (u890.j(lz20VarP, j6p1.r())) {
                            d030VarK = dm5.K(d030Var);
                            if (d030VarK != null) {
                                return (Boolean) iu30Var.invoke(d030VarK);
                            }
                        } else if (!u890.j(lz20VarP, j6p1.p())) {
                            if (lz20VarP != j6p1.p()) {
                                eg.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                                return null;
                            }
                            if (lz20VarP != j6p1.o()) {
                                eg.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                                return null;
                            }
                            if (lz20VarP.a().c == 0) {
                                System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            } else {
                                bfn0 bfn0VarA = lz20VarP.a();
                                objArr = bfn0VarA.a;
                                i2 = bfn0VarA.c;
                                z = false;
                                for (i3 = 0; i3 < i2; i3++) {
                                    obj = (nz20) objArr[i3];
                                    if (!((pim0) obj).a.N0) {
                                        qf80.c("visitChildren called on an unattached node");
                                    }
                                    bfn0Var = new bfn0(0, new pim0[16]);
                                    pim0Var = ((pim0) obj).a;
                                    pim0Var2 = pim0Var.f;
                                    if (pim0Var2 == null) {
                                        oap1.d(bfn0Var, pim0Var);
                                    } else {
                                        bfn0Var.b(pim0Var2);
                                    }
                                    while (true) {
                                        i4 = bfn0Var.c;
                                        if (i4 != 0) {
                                            break;
                                        }
                                        pim0VarE = (pim0) bfn0Var.l(i4 - 1);
                                        if ((pim0VarE.d & 1024) == 0) {
                                            oap1.d(bfn0Var, pim0VarE);
                                        } else {
                                            while (pim0VarE != null) {
                                                if ((pim0VarE.c & 1024) != 0) {
                                                    bfn0Var2 = null;
                                                    while (pim0VarE != null) {
                                                        if (pim0VarE instanceof d030) {
                                                            if (((Boolean) iu30Var.invoke((d030) pim0VarE)).booleanValue()) {
                                                                z = true;
                                                                break;
                                                            }
                                                        } else if ((pim0VarE.c & 1024) == 0 && (pim0VarE instanceof l5t)) {
                                                            int i6 = 0;
                                                            for (pim0 pim0Var3 = ((l5t) pim0VarE).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                                                if ((pim0Var3.c & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        pim0VarE = pim0Var3;
                                                                    } else {
                                                                        if (bfn0Var2 == null) {
                                                                            bfn0Var2 = new bfn0(0, new pim0[16]);
                                                                        }
                                                                        if (pim0VarE != null) {
                                                                            bfn0Var2.b(pim0VarE);
                                                                            pim0VarE = null;
                                                                        }
                                                                        bfn0Var2.b(pim0Var3);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        pim0VarE = oap1.e(bfn0Var2);
                                                    }
                                                    break;
                                                }
                                                pim0VarE = pim0VarE.f;
                                            }
                                        }
                                    }
                                }
                                zBooleanValue = z;
                            }
                            return Boolean.valueOf(zBooleanValue);
                        }
                    }
                    return null;
                }
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    lz20VarO = gz20VarJ1.o();
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    lz20VarO = gz20VarJ1.g();
                }
                lz20 lz20Var6 = lz20.b;
                lz20VarN = lz20VarO == j6p1.p() ? null : lz20VarO;
                if (lz20VarN == null) {
                    lz20VarN = gz20VarJ1.i();
                }
            }
            lz20VarP = lz20VarN;
            lz20 lz20Var7 = lz20.b;
            if (!u890.j(lz20VarP, j6p1.o())) {
                if (u890.j(lz20VarP, j6p1.r())) {
                    d030VarK = dm5.K(d030Var);
                    if (d030VarK != null) {
                        return (Boolean) iu30Var.invoke(d030VarK);
                    }
                } else if (!u890.j(lz20VarP, j6p1.p())) {
                    if (lz20VarP != j6p1.p()) {
                        eg.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        return null;
                    }
                    if (lz20VarP != j6p1.o()) {
                        eg.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        return null;
                    }
                    if (lz20VarP.a().c == 0) {
                        System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    } else {
                        bfn0 bfn0VarA2 = lz20VarP.a();
                        objArr = bfn0VarA2.a;
                        i2 = bfn0VarA2.c;
                        z = false;
                        while (i3 < i2) {
                            obj = (nz20) objArr[i3];
                            if (!((pim0) obj).a.N0) {
                                qf80.c("visitChildren called on an unattached node");
                            }
                            bfn0Var = new bfn0(0, new pim0[16]);
                            pim0Var = ((pim0) obj).a;
                            pim0Var2 = pim0Var.f;
                            if (pim0Var2 == null) {
                                oap1.d(bfn0Var, pim0Var);
                            } else {
                                bfn0Var.b(pim0Var2);
                            }
                            while (true) {
                                i4 = bfn0Var.c;
                                if (i4 != 0) {
                                    break;
                                    break;
                                }
                                pim0VarE = (pim0) bfn0Var.l(i4 - 1);
                                if ((pim0VarE.d & 1024) == 0) {
                                    oap1.d(bfn0Var, pim0VarE);
                                } else {
                                    while (pim0VarE != null) {
                                        if ((pim0VarE.c & 1024) != 0) {
                                            bfn0Var2 = null;
                                            while (pim0VarE != null) {
                                                if (pim0VarE instanceof d030) {
                                                    if (((Boolean) iu30Var.invoke((d030) pim0VarE)).booleanValue()) {
                                                        z = true;
                                                        break;
                                                        break;
                                                    }
                                                } else if ((pim0VarE.c & 1024) == 0) {
                                                }
                                                pim0VarE = oap1.e(bfn0Var2);
                                            }
                                            break;
                                            break;
                                        }
                                        pim0VarE = pim0VarE.f;
                                    }
                                }
                            }
                        }
                        zBooleanValue = z;
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
            }
            return null;
        }
        d030VarK2 = null;
        flb0 layoutDirection2 = ha4Var.getLayoutDirection();
        pg pgVar = new pg(d030VarK2, iu30Var, this, (byte) 15);
        if (yx20.b(i, 1) || yx20.b(i, 2)) {
            return Boolean.valueOf(hqq0.f0(d030Var, i, pgVar));
        }
        if (yx20.b(i, 3) || yx20.b(i, 4) || yx20.b(i, 5) || yx20.b(i, 6)) {
            return irn1.p0(i, pgVar, d030Var, n511Var);
        }
        if (yx20.b(i, 7)) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                i5 = 3;
            }
            d030 d030VarK3 = dm5.K(d030Var);
            if (d030VarK3 != null) {
                return irn1.p0(i5, pgVar, d030VarK3, n511Var);
            }
            return null;
        }
        if (!yx20.b(i, 8)) {
            k220.f("Focus search invoked with invalid FocusDirection ".concat(yx20.c(i)));
            return null;
        }
        d030 d030VarK4 = dm5.K(d030Var);
        if (d030VarK4 != null) {
            if (!d030VarK4.a.N0) {
                qf80.c("visitAncestors called on an unattached node");
            }
            pim0 pim0Var4 = d030VarK4.a.e;
            hmb0 hmb0VarB = oap1.B(d030VarK4);
            loop5: while (hmb0VarB != null) {
                if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                    while (pim0Var4 != null) {
                        if ((pim0Var4.c & 1024) != 0) {
                            pim0 pim0VarE2 = pim0Var4;
                            bfn0 bfn0Var3 = null;
                            while (pim0VarE2 != null) {
                                if (pim0VarE2 instanceof d030) {
                                    d030 d030Var3 = (d030) pim0VarE2;
                                    if (d030Var3.J1().e()) {
                                        d030Var2 = d030Var3;
                                        break loop5;
                                    }
                                } else if ((pim0VarE2.c & 1024) != 0 && (pim0VarE2 instanceof l5t)) {
                                    int i7 = 0;
                                    for (pim0 pim0Var5 = ((l5t) pim0VarE2).P0; pim0Var5 != null; pim0Var5 = pim0Var5.f) {
                                        if ((pim0Var5.c & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                pim0VarE2 = pim0Var5;
                                            } else {
                                                if (bfn0Var3 == null) {
                                                    bfn0Var3 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarE2 != null) {
                                                    bfn0Var3.b(pim0VarE2);
                                                    pim0VarE2 = null;
                                                }
                                                bfn0Var3.b(pim0Var5);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        pim0VarE2 = oap1.e(bfn0Var3);
                                    }
                                }
                                pim0VarE2 = oap1.e(bfn0Var3);
                            }
                        }
                        pim0Var4 = pim0Var4.e;
                    }
                }
                hmb0VarB = hmb0VarB.v();
                pim0Var4 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
            }
        }
        d030 d030Var4 = d030Var2;
        if (d030Var4 != null && d030Var4 != d030Var) {
            zBooleanValue = ((Boolean) pgVar.invoke(d030Var4)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final d030 h() {
        d030 d030Var = this.h;
        if (d030Var == null || !d030Var.N0) {
            return null;
        }
        return d030Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean i(int i, boolean z) throws NoWhenBranchMatchedException {
        d030 d030VarH = h();
        ha4 ha4Var = this.a;
        if (d030VarH == null || !d030VarH.O0 || !ha4Var.v(i)) {
            p811 p811Var = new p811();
            p811Var.a = Boolean.FALSE;
            d030 d030VarH2 = h();
            Boolean boolG = g(i, ha4Var.getEmbeddedViewFocusRect(), new bz20(p811Var, i, (byte) 0));
            if (!u890.j(boolG, Boolean.TRUE) || d030VarH2 == h()) {
                if (boolG != null && p811Var.a != null) {
                    if (!boolG.booleanValue() || !((Boolean) p811Var.a).booleanValue()) {
                        if (g6p1.o(i) && z && d(i, false, false)) {
                            Boolean boolG2 = g(i, null, new p94(i, (byte) 4));
                            if (boolG2 != null ? boolG2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean j(int i) throws NoWhenBranchMatchedException {
        if (!d(i, false, false)) {
            return false;
        }
        Boolean boolG = g(i, null, new p94(i, (byte) 3));
        boolean zBooleanValue = boolG != null ? boolG.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public final void k(d030 d030Var) {
        d030 d030Var2 = this.h;
        this.h = d030Var;
        wdn0 wdn0Var = this.g;
        Object[] objArr = wdn0Var.a;
        int i = wdn0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((wy20) objArr[i2]).a(d030Var2, d030Var);
        }
    }
}
