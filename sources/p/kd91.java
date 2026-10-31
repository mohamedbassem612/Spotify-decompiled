package p;

import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;
import com.spotify.home.slotloading.proto.GetSlotContentResponse;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kd91 {
    public final se91 a;
    public final uny b;
    public final yqg c;
    public final yjq d;
    public final u9c0 e;
    public final long f;

    public kd91(se91 se91Var, uny unyVar, yqg yqgVar, w25 w25Var, yjq yjqVar, u9c0 u9c0Var) {
        this.a = se91Var;
        this.b = unyVar;
        this.c = yqgVar;
        this.d = yjqVar;
        this.e = u9c0Var;
        this.f = ((long) w25Var.H()) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(ff91 ff91Var, qkg qkgVar, String str, String str2, boolean z, String str3, String str4, onm onmVar) {
        hd91 hd91Var;
        m231 m231Var;
        if (onmVar instanceof hd91) {
            hd91Var = (hd91) onmVar;
            int i = hd91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hd91Var.c = i - Integer.MIN_VALUE;
            } else {
                hd91Var = new hd91(this, onmVar);
            }
        } else {
            hd91Var = new hd91(this, onmVar);
        }
        hd91 hd91Var2 = hd91Var;
        Object objB = hd91Var2.a;
        int i2 = hd91Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                se91 se91Var = this.a;
                int number = ff91Var.getNumber();
                String str5 = qkgVar.b;
                String id = this.c.g().getID();
                hd91Var2.c = 1;
                objB = se91Var.b(str, number, str5, id, str2, z, str3, str4, hd91Var2);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            m231Var = (sy21) objB;
            if (!((sy21) m231Var).a.Q0 || ((sy21) m231Var).b == null) {
                m231Var = null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public final nd91 b(GetSlotContentResponse getSlotContentResponse, x4e0 x4e0Var, boolean z) {
        BatchedExtensionResponse batchedExtensionResponseP = getSlotContentResponse.n().p();
        ioj0 ioj0VarH = batchedExtensionResponseP.p() > 0 ? this.d.h(batchedExtensionResponseP) : null;
        yz21 yz21VarT = z47.t(getSlotContentResponse.o(), z);
        return new nd91(this.b.B(getSlotContentResponse.p(), z, yz21VarT), x4e0Var, yz21VarT, getSlotContentResponse.o().s(), ioj0VarH);
    }
}
