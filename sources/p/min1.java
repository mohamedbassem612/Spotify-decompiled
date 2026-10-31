package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class min1 extends wpn1 {
    public final /* synthetic */ byte q = 1;
    public final /* synthetic */ e321 r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public min1(e321 e321Var, int[] iArr) {
        super(e321Var, true);
        this.s = iArr;
        Objects.requireNonNull(e321Var);
        this.r = e321Var;
    }

    @Override // p.wpn1
    public final void l() {
        byte b = this.q;
        Object obj = this.s;
        e321 e321Var = this.r;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                knn1 knn1Var = e321Var.c;
                gon1 gon1VarM = m();
                int[] iArr = (int[]) obj;
                knn1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                long jC = knn1Var.c();
                try {
                    jSONObject.put("requestId", jC);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", knn1Var.e());
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("itemIds", jSONArray);
                    break;
                } catch (JSONException unused) {
                }
                knn1Var.b(jC, jSONObject.toString());
                knn1Var.s.a(jC, gon1VarM);
                break;
            default:
                knn1 knn1Var2 = e321Var.c;
                gon1 gon1VarM2 = m();
                knn1Var2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jC2 = knn1Var2.c();
                long j = ((dxh0) obj).a;
                try {
                    jSONObject2.put("requestId", jC2);
                    jSONObject2.put("type", "SEEK");
                    jSONObject2.put("mediaSessionId", knn1Var2.e());
                    Pattern pattern = o4e.a;
                    jSONObject2.put("currentTime", j / 1000.0d);
                    break;
                } catch (JSONException unused2) {
                }
                knn1Var2.b(jC2, jSONObject2.toString());
                knn1Var2.g = Long.valueOf(j);
                knn1Var2.m.a(jC2, new frl1(knn1Var2, gon1VarM2));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public min1(e321 e321Var, dxh0 dxh0Var) {
        super(e321Var, false);
        this.s = dxh0Var;
        this.r = e321Var;
    }
}
