package p;

import com.spotify.messages.ByomSessionStarted;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jm9 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm9 b;

    public /* synthetic */ jm9(rm9 rm9Var, byte b) {
        this.a = b;
        this.b = rm9Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rm9 rm9Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                lp9 lp9Var = (lp9) obj;
                if (lp9Var instanceof jp9) {
                    int iC = l1d.C(((jp9) lp9Var).c);
                    if (iC == 3) {
                        rm9Var.m(1);
                    } else if (iC == 4) {
                        rm9Var.m(5);
                    }
                }
                return rih1Var;
            case 1:
                int iOrdinal = ((cr9) obj).ordinal();
                if (iOrdinal == 0) {
                    rm9Var.c(3);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    rm9Var.m(8);
                }
                return rih1Var;
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
                ajq0 ajq0Var = rm9Var.o;
                br9 br9Var = (br9) ajq0Var.c;
                if (br9Var != null && zBooleanValue && zBooleanValue2 && ((String) ajq0Var.d) == null) {
                    String string = UUID.randomUUID().toString();
                    ajq0Var.d = string;
                    ajq0Var.e = Long.valueOf(((yqg) ajq0Var.b).e());
                    t2j0 t2j0Var = (t2j0) ajq0Var.a;
                    zfc zfcVarN = ByomSessionStarted.n();
                    zfcVarN.r(string);
                    zfcVarN.q(br9Var.a);
                    zfcVarN.n(br9Var.b);
                    String str = br9Var.c;
                    if (str != null) {
                        zfcVarN.s(str);
                    }
                    t2j0Var.a(zfcVarN.build());
                }
                return rih1Var;
            case 3:
                rm9Var.m(8);
                return rih1Var;
            default:
                vp9 vp9Var = (vp9) obj;
                if (u890.j(vp9Var, up9.a)) {
                    xab1 xab1Var = rm9Var.w;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                } else if (u890.j(vp9Var, qp9.a)) {
                    Object objJ = rm9Var.j(lnmVar);
                    if (objJ == d9n.a) {
                        return objJ;
                    }
                } else if (vp9Var instanceof pp9) {
                    rm9Var.D = ((pp9) vp9Var).a;
                } else if (u890.j(vp9Var, rp9.a)) {
                    rm9Var.c(3);
                } else if (u890.j(vp9Var, tp9.a)) {
                    rm9Var.c(4);
                } else {
                    if (!u890.j(vp9Var, sp9.a)) {
                        eg.o();
                        return null;
                    }
                    rm9Var.i(2131953078, null, new yt3(rm9Var.a.h, rm9Var));
                }
                return rih1Var;
        }
    }
}
