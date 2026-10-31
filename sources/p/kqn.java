package p;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kqn extends yjn {
    public final String a;

    public kqn(String str) {
        this.a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        hhg1.n("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public final String a() {
        return this.a;
    }
}
