package p;

import android.content.DialogInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class obr implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ JSONObject b;

    public /* synthetic */ obr(JSONObject jSONObject, byte b) {
        this.a = b;
        this.b = jSONObject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        JSONObject jSONObject = this.b;
        switch (b) {
            case 0:
                l6p1.n(l6p1.m("r", jSONObject));
                break;
            default:
                l6p1.n(l6p1.m("g", jSONObject));
                break;
        }
    }
}
