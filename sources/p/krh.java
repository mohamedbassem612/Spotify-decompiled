package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$ObserveCapStateChangedRequest;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class krh {
    public final jn7 a;

    public krh(jn7 jn7Var) {
        this.a = jn7Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static prh e(ql10 ql10Var) throws NoWhenBranchMatchedException {
        switch (ql10Var.ordinal()) {
            case 0:
                return prh.PICK_AND_SHUFFLE;
            case 1:
                return prh.AUDIOBOOKS;
            case 2:
                return prh.LYRICS;
            case 3:
                return prh.BLUEJAY;
            case 4:
                return prh.KALLAX;
            case 5:
                return prh.PROMPT_PLAYLIST;
            case 6:
                return prh.RUNNING_MODE;
            default:
                eg.o();
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(ql10 ql10Var, int i, onm onmVar) throws NoWhenBranchMatchedException {
        grh grhVar;
        if (onmVar instanceof grh) {
            grhVar = (grh) onmVar;
            int i2 = grhVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                grhVar.d = i2 - Integer.MIN_VALUE;
            } else {
                grhVar = new grh(this, onmVar);
            }
        } else {
            grhVar = new grh(this, onmVar);
        }
        Object objC = grhVar.b;
        int i3 = grhVar.d;
        if (i3 == 0) {
            hm5.M(objC);
            qrh qrhVarN = CommonCappingOuterClass.GetQuotaStateAtRequest.n();
            qrhVarN.q(e(ql10Var));
            qrhVarN.n(i);
            CommonCappingOuterClass.GetQuotaStateAtRequest getQuotaStateAtRequestBuild = qrhVarN.build();
            getQuotaStateAtRequestBuild.getClass();
            grhVar.a = this;
            grhVar.d = 1;
            objC = this.a.C(getQuotaStateAtRequestBuild, grhVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = grhVar.a;
            hm5.M(objC);
        }
        trh trhVarN = ((CommonCappingOuterClass.GetQuotaStateAtResponse) objC).n();
        this.getClass();
        int iOrdinal = trhVarN.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return qlz0.b;
            }
            if (iOrdinal == 2) {
                return qlz0.c;
            }
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
        }
        return qlz0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ql10 ql10Var, onm onmVar) {
        hrh hrhVar;
        if (onmVar instanceof hrh) {
            hrhVar = (hrh) onmVar;
            int i = hrhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrhVar.c = i - Integer.MIN_VALUE;
            } else {
                hrhVar = new hrh(this, onmVar);
            }
        } else {
            hrhVar = new hrh(this, onmVar);
        }
        Object objJ = hrhVar.a;
        int i2 = hrhVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            rrh rrhVarN = CommonCappingOuterClass.IsCappedRequest.n();
            rrhVarN.n(e(ql10Var));
            CommonCappingOuterClass.IsCappedRequest isCappedRequestBuild = rrhVarN.build();
            hrhVar.c = 1;
            objJ = this.a.J(isCappedRequestBuild, hrhVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.m(((CommonCappingOuterClass.IsCappedResponse) objJ).n());
    }

    public final nwd c(ql10 ql10Var) {
        srh srhVarN = CommonCappingOuterClass$ObserveCapStateChangedRequest.n();
        srhVarN.n(e(ql10Var));
        return new nwd(rqt0.u(this.a.R((CommonCappingOuterClass$ObserveCapStateChangedRequest) srhVarN.build())), (byte) 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    public final Object d(ql10 ql10Var, String str, long j, String str2, onm onmVar) throws Exception {
        jrh jrhVar;
        if (onmVar instanceof jrh) {
            jrhVar = (jrh) onmVar;
            int i = jrhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jrhVar.f = i - Integer.MIN_VALUE;
            } else {
                jrhVar = new jrh(this, onmVar);
            }
        } else {
            jrhVar = new jrh(this, onmVar);
        }
        Object obj = jrhVar.d;
        int i2 = jrhVar.f;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                vrh vrhVarN = CommonCappingOuterClass.ReportConsumptionRequest.n();
                vrhVarN.s(e(ql10Var));
                vrhVarN.r(str);
                vrhVarN.n(j);
                vrhVarN.q(str2);
                CommonCappingOuterClass.ReportConsumptionRequest reportConsumptionRequestBuild = vrhVarN.build();
                jn7 jn7Var = this.a;
                reportConsumptionRequestBuild.getClass();
                jrhVar.a = ql10Var;
                jrhVar.b = str;
                jrhVar.c = (int) j;
                jrhVar.f = 1;
                Object objF0 = jn7Var.f0(reportConsumptionRequestBuild, jrhVar);
                d9n d9nVar = d9n.a;
                if (objF0 == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = jrhVar.c ? 1L : 0L;
                str = jrhVar.b;
                ql10Var = jrhVar.a;
                hm5.M(obj);
            }
            Objects.toString(ql10Var);
            return rih1.a;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(ql10Var);
            sb.append(": Failed to add ");
            sb.append(j);
            sb.append(" consumption [");
            Logger.e(e, l1d.n(str, "]", sb), new Object[0]);
            throw e;
        }
    }
}
