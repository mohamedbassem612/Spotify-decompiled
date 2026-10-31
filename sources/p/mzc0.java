package p;

import android.util.Base64;
import com.spotify.homeagent.v1.WorldListAttributes;
import com.spotify.promptablesection.PromptableSectionListAttributes;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mzc0 {
    public final /* synthetic */ byte a;
    public final xrc0 b;
    public final iyc0 c;
    public final idd1 d;

    public mzc0(xrc0 xrc0Var, iyc0 iyc0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = xrc0Var;
                this.c = iyc0Var;
                this.d = new idd1(w3l1.a1);
                break;
            default:
                this.b = xrc0Var;
                this.c = iyc0Var;
                this.d = new idd1(df.Y0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final Object a(String str, String str2, onm onmVar) {
        kzc0 kzc0Var;
        wsc0 wsc0Var;
        String str3;
        int i;
        m231 m231Var;
        b6m1 b6m1Var;
        wsc0 wsc0Var2;
        String str4;
        int i2;
        m231 m231Var2;
        String str5 = str2;
        byte b = this.a;
        iyc0 iyc0Var = this.c;
        d9n d9nVar = d9n.a;
        m231 m231Var3 = rih1.a;
        lnm lnmVarT = null;
        switch (b) {
            case 0:
                if (onmVar instanceof kzc0) {
                    kzc0Var = (kzc0) onmVar;
                    int i3 = kzc0Var.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kzc0Var.d = i3 - Integer.MIN_VALUE;
                    } else {
                        kzc0Var = new kzc0(this, onmVar);
                    }
                } else {
                    kzc0Var = new kzc0(this, onmVar);
                }
                Object objA = kzc0Var.b;
                int i4 = kzc0Var.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        str5 = kzc0Var.a;
                        hm5.M(objA);
                    } else {
                        if (i4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objA);
                    }
                    wsc0Var = (wsc0) objA;
                    if (wsc0Var != null) {
                        str3 = (String) wsc0Var.f.q.get("promptable_section_attributes");
                        if (str3 != null) {
                            try {
                                lnmVarT = PromptableSectionListAttributes.t(Base64.decode(str3, 0));
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        if (lnmVarT == null) {
                            m231Var = new m231(fyx0.a);
                        } else if (lnmVarT.s() || lnmVarT.n().p() != qg51.VALIDATION_ERROR) {
                            i = jzc0.a[lnmVarT.r().ordinal()];
                            if (i != 1 && i != 2 && i != 3) {
                                m231Var3 = new m231(fyx0.a);
                            }
                        } else {
                            String strQ = lnmVarT.n().q();
                            m231Var = new m231(new hyx0(ihc1.y0(strQ) ? "Prompt validation failed" : strQ));
                        }
                        return m231Var;
                    }
                    return m231Var3;
                }
                hm5.M(objA);
                ayc0 ayc0Var = new ayc0("generate", null, phc.i(str), false, null, 26);
                kzc0Var.a = str5;
                kzc0Var.d = 1;
                objA = iyc0.a(iyc0Var, str5, ayc0Var, kzc0Var);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                ly21 ly21Var = (py21) objA;
                if (ly21Var instanceof ly21) {
                    return new m231(new gyx0(new IOException(ly21Var.a.b())));
                }
                ss90 ss90Var = new ss90(this, str5, lnmVarT, (byte) 29);
                kzc0Var.a = null;
                kzc0Var.d = 2;
                objA = rc2.O(5000L, ss90Var, kzc0Var);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                wsc0Var = (wsc0) objA;
                if (wsc0Var != null) {
                    str3 = (String) wsc0Var.f.q.get("promptable_section_attributes");
                    if (str3 != null) {
                        lnmVarT = PromptableSectionListAttributes.t(Base64.decode(str3, 0));
                        break;
                    }
                    if (lnmVarT == null) {
                        m231Var = new m231(fyx0.a);
                    } else {
                        if (lnmVarT.s()) {
                        }
                        i = jzc0.a[lnmVarT.r().ordinal()];
                        if (i != 1) {
                            m231Var3 = new m231(fyx0.a);
                        }
                    }
                    return m231Var;
                }
                return m231Var3;
            default:
                if (onmVar instanceof b6m1) {
                    b6m1Var = (b6m1) onmVar;
                    int i5 = b6m1Var.d;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        b6m1Var.d = i5 - Integer.MIN_VALUE;
                    } else {
                        b6m1Var = new b6m1(this, onmVar);
                    }
                } else {
                    b6m1Var = new b6m1(this, onmVar);
                }
                Object objA2 = b6m1Var.b;
                int i6 = b6m1Var.d;
                if (i6 != 0) {
                    if (i6 == 1) {
                        str5 = b6m1Var.a;
                        hm5.M(objA2);
                    } else {
                        if (i6 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objA2);
                    }
                    wsc0Var2 = (wsc0) objA2;
                    if (wsc0Var2 != null) {
                        str4 = (String) wsc0Var2.f.q.get("world_attributes");
                        if (str4 != null) {
                            try {
                                lnmVarT = WorldListAttributes.u(Base64.decode(str4, 0));
                                break;
                            } catch (Exception unused2) {
                            }
                        }
                        if (lnmVarT == null) {
                            m231Var2 = new m231(fyx0.a);
                        } else if (lnmVarT.t() || lnmVarT.n().o() != z5m1.VALIDATION_ERROR) {
                            i2 = a6m1.a[lnmVarT.s().ordinal()];
                            if (i2 != 1 && i2 != 2 && i2 != 3) {
                                m231Var3 = new m231(fyx0.a);
                            }
                        } else {
                            String strP = lnmVarT.n().p();
                            m231Var2 = new m231(new hyx0(ihc1.y0(strP) ? "Prompt validation failed" : strP));
                        }
                        return m231Var2;
                    }
                    return m231Var3;
                }
                hm5.M(objA2);
                ayc0 ayc0Var2 = new ayc0("generate", null, phc.i(str), false, null, 26);
                b6m1Var.a = str5;
                b6m1Var.d = 1;
                objA2 = iyc0.a(iyc0Var, str5, ayc0Var2, b6m1Var);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                ly21 ly21Var2 = (py21) objA2;
                if (ly21Var2 instanceof ly21) {
                    return new m231(new gyx0(new IOException(ly21Var2.a.b())));
                }
                gqj1 gqj1Var = new gqj1(this, str5, (lnm) null, (byte) 26);
                b6m1Var.a = null;
                b6m1Var.d = 2;
                objA2 = rc2.O(5000L, gqj1Var, b6m1Var);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                wsc0Var2 = (wsc0) objA2;
                if (wsc0Var2 != null) {
                    str4 = (String) wsc0Var2.f.q.get("world_attributes");
                    if (str4 != null) {
                        lnmVarT = WorldListAttributes.u(Base64.decode(str4, 0));
                        break;
                    }
                    if (lnmVarT == null) {
                        m231Var2 = new m231(fyx0.a);
                    } else {
                        if (lnmVarT.t()) {
                        }
                        i2 = a6m1.a[lnmVarT.s().ordinal()];
                        if (i2 != 1) {
                            m231Var3 = new m231(fyx0.a);
                        }
                    }
                    return m231Var2;
                }
                return m231Var3;
        }
    }
}
