package p;

import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rn0 implements pn0 {
    public final gn0 a;

    public rn0(gn0 gn0Var) {
        this.a = gn0Var;
    }

    public static int d(kn0 kn0Var) {
        int iOrdinal = kn0Var.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }

    public final ezc b(String str, String str2) {
        hn0 hn0VarN = AdDetectionOuterClass.DetectRequest.n();
        hn0VarN.n(str);
        hn0VarN.q(str2);
        AdDetectionOuterClass.DetectRequest detectRequestBuild = hn0VarN.build();
        detectRequestBuild.getClass();
        return yoi1.g(this.a.callStream("spotify.ad_detection.impl.ad_detection_proto.AdDetection", "Detect", detectRequestBuild).map(m9h.d).distinctUntilChanged().map(new n9x0(this)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, int i, x3o x3oVar, onm onmVar) {
        qn0 qn0Var;
        on0 on0Var;
        if (onmVar instanceof qn0) {
            qn0Var = (qn0) onmVar;
            int i2 = qn0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qn0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                qn0Var = new qn0(this, onmVar);
            }
        } else {
            qn0Var = new qn0(this, onmVar);
        }
        Object objO = qn0Var.a;
        int i3 = qn0Var.c;
        if (i3 == 0) {
            hm5.M(objO);
            int iOrdinal = x3oVar.ordinal();
            if (iOrdinal == 0) {
                on0Var = on0.CLIENT_PRODUCED;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                on0Var = on0.INFERRED;
            }
            jn0 jn0VarN = AdDetectionOuterClass.MapTimestampRequest.n();
            jn0VarN.n(str);
            jn0VarN.s(i);
            jn0VarN.r(on0Var);
            q4 q4Var = new q4(this, jn0VarN, (lnm) null, (byte) 13);
            qn0Var.c = 1;
            objO = rc2.O(1000L, q4Var, qn0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        qpg0 qpg0Var = (qpg0) objO;
        return qpg0Var == null ? ppg0.a : qpg0Var;
    }
}
