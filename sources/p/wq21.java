package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wq21 {
    public static final z771 c;
    public final r961 a;
    public final m021 b;

    static {
        Set set = s4b1.f;
        c = new z771(uic.x("spotify:shareformat:reserved"));
    }

    public wq21(r961 r961Var, m021 m021Var) {
        this.a = r961Var;
        this.b = m021Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0082, please report this as an issue */
    public final Object a(wa71 wa71Var, onm onmVar) {
        vq21 vq21Var;
        jq71 jq71Var;
        smc0 smc0VarN;
        Integer num;
        smc0 smc0VarK;
        f0a f0aVar;
        String str;
        dqi1 dqi1Var;
        String str2;
        String str3;
        int iIntValue;
        Integer num2;
        if (onmVar instanceof vq21) {
            vq21Var = (vq21) onmVar;
            int i = vq21Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq21Var.e = i - Integer.MIN_VALUE;
            } else {
                vq21Var = new vq21(this, onmVar);
            }
        } else {
            vq21Var = new vq21(this, onmVar);
        }
        Object objN = vq21Var.c;
        int i2 = vq21Var.e;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objN);
            iq71 iq71Var = new iq71(wa71Var.a, c, (String) null, (String) null, 12);
            vq21Var.a = wa71Var;
            vq21Var.e = 1;
            objN = this.a.n(iq71Var, vq21Var);
            if (objN != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            wa71Var = vq21Var.a;
            hm5.M(objN);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jq71Var = vq21Var.b;
            wa71Var = vq21Var.a;
            hm5.M(objN);
        }
        if (((Boolean) objN).booleanValue()) {
            smc0VarN = k4p1.n();
            num = jq71Var.b;
            if (num != null) {
                iIntValue = num.intValue();
                num2 = jq71Var.c;
                if (num2 != null) {
                    smc0VarN.add(new ilw0(iIntValue, num2.intValue(), ""));
                }
                smc0VarN.add(new ilw0(iIntValue, -16777216, ""));
            }
            smc0VarK = k4p1.k(smc0VarN);
            if (smc0VarK.isEmpty()) {
                smc0VarK = null;
            }
            if (smc0VarK != null) {
                Uri uri = jq71Var.a;
                String strA = jq71Var.a();
                jlw0 jlw0Var = new jlw0(uri, strA != null ? strA : "");
                f0aVar = new f0a();
                f0aVar.b = wa71Var.a;
                ArrayList arrayList = (ArrayList) f0aVar.g;
                arrayList.clear();
                arrayList.addAll(smc0VarK);
                f0aVar.i = jlw0Var;
                f0aVar.Y = new oz9(jlw0Var, (jlw0) null);
                f0aVar.h = c;
                f0aVar.X = null;
                f0aVar.P0 = dz61.d;
                ((LinkedHashMap) f0aVar.Z).putAll(wa71Var.c);
                str = wa71Var.b;
                if (str != null) {
                    f0aVar.e = str;
                }
                dqi1Var = wa71Var.d;
                if (dqi1Var != null) {
                    f0aVar.t = dqi1Var;
                }
                str2 = wa71Var.e;
                if (str2 != null) {
                    f0aVar.c = str2;
                }
                str3 = wa71Var.f;
                if (str3 != null) {
                    f0aVar.d = str3;
                }
                return f0aVar.p();
            }
        }
        return null;
        jq71 jq71Var2 = (jq71) objN;
        Uri uri2 = jq71Var2.a;
        vq21Var.a = wa71Var;
        vq21Var.b = jq71Var2;
        vq21Var.e = 2;
        m021 m021Var = this.b;
        Object objY = fn31.Y((q8n) m021Var.c, new i3y0(m021Var, uri2, lnmVar, (byte) 15), vq21Var);
        if (objY != d9nVar) {
            objN = objY;
            jq71Var = jq71Var2;
            if (((Boolean) objN).booleanValue()) {
                smc0VarN = k4p1.n();
                num = jq71Var.b;
                if (num != null) {
                    iIntValue = num.intValue();
                    num2 = jq71Var.c;
                    if (num2 != null) {
                        smc0VarN.add(new ilw0(iIntValue, num2.intValue(), ""));
                    }
                    smc0VarN.add(new ilw0(iIntValue, -16777216, ""));
                }
                smc0VarK = k4p1.k(smc0VarN);
                if (smc0VarK.isEmpty()) {
                    smc0VarK = null;
                }
                if (smc0VarK != null) {
                    Uri uri3 = jq71Var.a;
                    String strA2 = jq71Var.a();
                    jlw0 jlw0Var2 = new jlw0(uri3, strA2 != null ? strA2 : "");
                    f0aVar = new f0a();
                    f0aVar.b = wa71Var.a;
                    ArrayList arrayList2 = (ArrayList) f0aVar.g;
                    arrayList2.clear();
                    arrayList2.addAll(smc0VarK);
                    f0aVar.i = jlw0Var2;
                    f0aVar.Y = new oz9(jlw0Var2, (jlw0) null);
                    f0aVar.h = c;
                    f0aVar.X = null;
                    f0aVar.P0 = dz61.d;
                    ((LinkedHashMap) f0aVar.Z).putAll(wa71Var.c);
                    str = wa71Var.b;
                    if (str != null) {
                        f0aVar.e = str;
                    }
                    dqi1Var = wa71Var.d;
                    if (dqi1Var != null) {
                        f0aVar.t = dqi1Var;
                    }
                    str2 = wa71Var.e;
                    if (str2 != null) {
                        f0aVar.c = str2;
                    }
                    str3 = wa71Var.f;
                    if (str3 != null) {
                        f0aVar.d = str3;
                    }
                    return f0aVar.p();
                }
            }
            return null;
        }
        return d9nVar;
    }
}
