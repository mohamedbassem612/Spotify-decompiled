package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ui01 implements ji01 {
    public static final PlaylistRequestDecorationPolicy j;
    public final String a;
    public final xrc0 b;
    public final iyc0 c;
    public final k0d0 d;
    public final gsg e;
    public final zeu0 f;
    public final yqg g;
    public final ljg h;
    public xab1 i;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        hru0VarS.v(iou0VarV);
        j = hru0VarS.build();
    }

    public ui01(String str, xrc0 xrc0Var, iyc0 iyc0Var, k0d0 k0d0Var, gsg gsgVar, zeu0 zeu0Var, yqg yqgVar, ljg ljgVar) {
        this.a = str;
        this.b = xrc0Var;
        this.c = iyc0Var;
        this.d = k0d0Var;
        this.e = gsgVar;
        this.f = zeu0Var;
        this.g = yqgVar;
        this.h = ljgVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    public static qi01 b(wsc0 wsc0Var) {
        Object next;
        Map map = wsc0Var.f.q;
        String str = (String) map.get("recap.status_code");
        String str2 = (String) map.get("recap.error_type");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 49586) {
                if (iHashCode != 51508) {
                    if (u890.j(str2, "NOT_ENOUGH_PROGRESS")) {
                        return mi01.a;
                    }
                    if (u890.j(str2, "PROGRESS_VS_CONSUMPTION_MISMATCH")) {
                        return ni01.a;
                    }
                } else {
                    if (u890.j(str2, "NOT_ENOUGH_PROGRESS")) {
                        return mi01.a;
                    }
                    if (u890.j(str2, "PROGRESS_VS_CONSUMPTION_MISMATCH")) {
                        return ni01.a;
                    }
                }
            } else if (str.equals("200")) {
                Iterator it = wsc0Var.e.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u890.j(((zuc0) next).g.get("is_audiobook_recap"), "true"));
                zuc0 zuc0Var = (zuc0) next;
                if (zuc0Var != null) {
                    String str3 = zuc0Var.c;
                    if (str3.length() > 0) {
                        return new pi01(str3);
                    }
                }
                return li01.a;
            }
        }
        return oi01.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r13.d.d(r1, r14, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ui01.c(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(onm onmVar) throws NoWhenBranchMatchedException {
        ti01 ti01Var;
        if (onmVar instanceof ti01) {
            ti01Var = (ti01) onmVar;
            int i = ti01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti01Var.c = i - Integer.MIN_VALUE;
            } else {
                ti01Var = new ti01(this, onmVar);
            }
        } else {
            ti01Var = new ti01(this, onmVar);
        }
        Object objJ = ti01Var.a;
        int i2 = ti01Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleC = ljg.c(this.h, "audiobooks:recap-finished:v1", (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510);
                ti01Var.c = 1;
                objJ = fc11.j(singleC, ti01Var);
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
            MessageResponse.Failure failure = (MessageResponse) objJ;
            if (!(failure instanceof MessageResponse.Success)) {
                if (!(failure instanceof MessageResponse.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                n57.s("Recap finished trigger discarded: " + failure.getDiscardReason());
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Exception requesting recap finished trigger", e2);
        }
        return rih1.a;
    }
}
