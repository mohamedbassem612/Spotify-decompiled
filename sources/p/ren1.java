package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ren1 extends wpn1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ e321 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ren1(e321 e321Var, byte b) {
        super(e321Var, true);
        this.q = b;
        switch (b) {
            case 5:
                Objects.requireNonNull(e321Var);
                this.r = e321Var;
                super(e321Var, false);
                break;
            default:
                Objects.requireNonNull(e321Var);
                this.r = e321Var;
                break;
        }
    }

    @Override // p.wpn1
    public final void l() {
        byte b = this.q;
        e321 e321Var = this.r;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e321Var.c.d(m(), -1);
                break;
            case 1:
                e321Var.c.d(m(), 1);
                break;
            case 2:
                knn1 knn1Var = e321Var.c;
                gon1 gon1VarM = m();
                knn1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                long jC = knn1Var.c();
                try {
                    jSONObject.put("requestId", jC);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", knn1Var.e());
                    break;
                } catch (JSONException unused) {
                }
                knn1Var.b(jC, jSONObject.toString());
                knn1Var.r.a(jC, gon1VarM);
                break;
            case 3:
                knn1 knn1Var2 = e321Var.c;
                gon1 gon1VarM2 = m();
                knn1Var2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jC2 = knn1Var2.c();
                try {
                    jSONObject2.put("requestId", jC2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", knn1Var2.e());
                    break;
                } catch (JSONException unused2) {
                }
                knn1Var2.b(jC2, jSONObject2.toString());
                knn1Var2.k.a(jC2, gon1VarM2);
                break;
            case 4:
                knn1 knn1Var3 = e321Var.c;
                gon1 gon1VarM3 = m();
                knn1Var3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long jC3 = knn1Var3.c();
                try {
                    jSONObject3.put("requestId", jC3);
                    jSONObject3.put("type", "PLAY");
                    jSONObject3.put("mediaSessionId", knn1Var3.e());
                    break;
                } catch (JSONException unused3) {
                }
                knn1Var3.b(jC3, jSONObject3.toString());
                knn1Var3.l.a(jC3, gon1VarM3);
                break;
            default:
                knn1 knn1Var4 = e321Var.c;
                gon1 gon1VarM4 = m();
                knn1Var4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long jC4 = knn1Var4.c();
                try {
                    jSONObject4.put("requestId", jC4);
                    jSONObject4.put("type", "GET_STATUS");
                    j3i0 j3i0Var = knn1Var4.f;
                    if (j3i0Var != null) {
                        jSONObject4.put("mediaSessionId", j3i0Var.b);
                    }
                    break;
                } catch (JSONException unused4) {
                }
                knn1Var4.b(jC4, jSONObject4.toString());
                knn1Var4.f20p.a(jC4, gon1VarM4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ren1(e321 e321Var, byte b, boolean z) {
        super(e321Var, false);
        this.q = b;
        this.r = e321Var;
    }
}
