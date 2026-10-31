package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zjf1 {
    public static final long b;
    public static final /* synthetic */ int c = 0;
    public final uu00 a;

    static {
        ytw0 ytw0Var = jfv.b;
        b = fdg1.k0(10, ngv.e);
    }

    public zjf1(uu00 uu00Var) {
        this.a = uu00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, onm onmVar) {
        yjf1 yjf1Var;
        lh7 lh7Var;
        if (onmVar instanceof yjf1) {
            yjf1Var = (yjf1) onmVar;
            int i = yjf1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjf1Var.d = i - Integer.MIN_VALUE;
            } else {
                yjf1Var = new yjf1(this, onmVar);
            }
        } else {
            yjf1Var = new yjf1(this, onmVar);
        }
        Object objP = yjf1Var.b;
        int i2 = yjf1Var.d;
        lnm lnmVar = null;
        long j = b;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                if (arrayList.isEmpty()) {
                    return arrayList;
                }
                pec1 pec1Var = new pec1(this, arrayList, lnmVar, (byte) 20);
                yjf1Var.a = arrayList;
                yjf1Var.d = 1;
                objP = rc2.P(j, pec1Var, yjf1Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = yjf1Var.a;
                hm5.M(objP);
            }
            uv00 uv00Var = (uv00) objP;
            if (uv00Var == null) {
                Logger.k("SongDNA search: audio associations did not answer within %s.", new Object[]{new jfv(j)});
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (String str : arrayList) {
                lo7 lo7Var = uv00Var.a(lo7.class, str).b;
                if (lo7Var != null && (lh7Var = (lh7) o7h.s0(lo7Var.a)) != null) {
                    str = lh7Var.a;
                }
                arrayList2.add(str);
            }
            return arrayList2;
        } catch (Exception e) {
            op71.x(yjf1Var.getContext());
            Logger.l(e, "SongDNA search: the audio association lookup failed.", new Object[0]);
            return arrayList;
        }
    }
}
