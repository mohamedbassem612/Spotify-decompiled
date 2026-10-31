package p;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f4w {
    public static final t380 e = t380.t(1, 2);
    public final bg11 a;
    public final t380 b;
    public final boolean c;
    public final boolean d;

    public f4w(otu otuVar) {
        bg11 bg11VarG = ((v280) otuVar.b).g();
        this.a = bg11VarG;
        boolean z = true;
        dm5.n(!bg11VarG.isEmpty(), "The sequence must contain at least one EditedMediaItem.");
        t380 t380Var = (t380) otuVar.c;
        if (t380Var.contains(-2)) {
            if (e4w.d(((e4w) bg11VarG.get(0)).a) && !t380Var.contains(1) && !t380Var.contains(2)) {
                z = false;
            }
            dm5.n(z, "If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set");
        }
        this.b = t380Var;
        this.c = t380Var.contains(1);
        this.d = t380Var.contains(2);
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            bg11 bg11Var = this.a;
            if (i >= bg11Var.d) {
                return false;
            }
            if (e4w.d(((e4w) bg11Var.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                bg11 bg11Var = this.a;
                if (i >= bg11Var.d) {
                    jSONObject.put("mediaItems", jSONArray);
                    jSONObject.put("trackTypes", new JSONArray((Collection) this.b));
                    jSONObject.put("isLooping", false);
                    return jSONObject;
                }
                jSONArray.put(((e4w) bg11Var.get(i)).f());
                i++;
            }
        } catch (JSONException e2) {
            oon1.I("JSON conversion failed.", e2);
            return new JSONObject();
        }
    }

    public final String toString() {
        return b().toString();
    }
}
