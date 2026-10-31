package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.Receipt;
import com.spotify.wrapped.v1.proto.StoryReceiptRequest;
import com.spotify.wrapped.v1.proto.StoryReceiptResponse;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mk01 {
    public final q8n a;
    public final pk01 b;

    public mk01(q8n q8nVar, pk01 pk01Var) {
        this.a = q8nVar;
        this.b = pk01Var;
    }

    public static rk01 b(String str, sy21 sy21Var) {
        ry21 ry21Var = sy21Var.a;
        int i = ry21Var.d;
        String str2 = ry21Var.c;
        StringBuilder sbS = l1d.s(i, "Receipt for card ", str, " failed with HTTP ", ": ");
        sbS.append(str2);
        Logger.d(sbS.toString(), new Object[0]);
        return new rk01(ry21Var.d == 404 ? 1 : 2);
    }

    public static xk01 c(String str, sy21 sy21Var) {
        Receipt receiptN;
        StoryReceiptResponse storyReceiptResponse = (StoryReceiptResponse) sy21Var.b;
        if (storyReceiptResponse == null || (receiptN = storyReceiptResponse.n()) == null) {
            Logger.d(f4i1.f("Receipt for card ", str, " returned null receipt"), new Object[0]);
            return new rk01(1);
        }
        h290<Receipt.Component> h290VarO = receiptN.q().o();
        ArrayList arrayList = new ArrayList();
        for (Receipt.Component component : h290VarO) {
            component.getClass();
            wj01 wj01VarA = ok01.a(component);
            if (wj01VarA != null) {
                arrayList.add(wj01VarA);
            }
        }
        h290<Receipt.Component> h290VarO2 = receiptN.o();
        ArrayList arrayList2 = new ArrayList();
        for (Receipt.Component component2 : h290VarO2) {
            component2.getClass();
            wj01 wj01VarA2 = ok01.a(component2);
            if (wj01VarA2 != null) {
                arrayList2.add(wj01VarA2);
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            Logger.d(f4i1.f("Receipt for card ", str, " returned no displayable components"), new Object[0]);
            return new rk01(1);
        }
        arrayList2.size();
        return new sk01(receiptN.q().n(), receiptN.n(), arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: Exception -> 0x002c, CancellationException -> 0x0099, TryCatch #0 {Exception -> 0x002c, blocks: (B:13:0x0028, B:29:0x0073, B:31:0x007b, B:33:0x0080), top: B:41:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: Exception -> 0x002c, CancellationException -> 0x0099, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:13:0x0028, B:29:0x0073, B:31:0x007b, B:33:0x0080), top: B:41:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, String str, onm onmVar) {
        lk01 lk01Var;
        String str2;
        if (onmVar instanceof lk01) {
            lk01Var = (lk01) onmVar;
            int i = lk01Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk01Var.e = i - Integer.MIN_VALUE;
            } else {
                lk01Var = new lk01(this, onmVar);
            }
        } else {
            lk01Var = new lk01(this, onmVar);
        }
        Object objA = lk01Var.c;
        int i2 = lk01Var.e;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objA);
                    if (j > 0) {
                        lk01Var.a = str;
                        lk01Var.b = j;
                        lk01Var.e = 1;
                        if (hap1.i(j, lk01Var) != d9nVar) {
                        }
                    }
                    return d9nVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = lk01Var.a;
                    try {
                        hm5.M(objA);
                        sy21 sy21Var = (sy21) objA;
                        return sy21Var.a.Q0 ? c(str2, sy21Var) : b(str2, sy21Var);
                    } catch (Exception e) {
                        e = e;
                        Logger.e(e, l1d.m("Failed to load receipt for card ", str2), new Object[0]);
                        return new rk01(2);
                    }
                }
                j = lk01Var.b;
                str = lk01Var.a;
                hm5.M(objA);
                e9c1 e9c1VarN = StoryReceiptRequest.n();
                e9c1VarN.n(str);
                StoryReceiptRequest storyReceiptRequestBuild = e9c1VarN.build();
                pk01 pk01Var = this.b;
                storyReceiptRequestBuild.getClass();
                lk01Var.a = str;
                lk01Var.b = j;
                lk01Var.e = 2;
                objA = pk01Var.a(storyReceiptRequestBuild, lk01Var);
                if (objA != d9nVar) {
                    str2 = str;
                    sy21 sy21Var2 = (sy21) objA;
                    if (sy21Var2.a.Q0) {
                    }
                }
                return d9nVar;
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                Logger.e(e, l1d.m("Failed to load receipt for card ", str2), new Object[0]);
                return new rk01(2);
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
