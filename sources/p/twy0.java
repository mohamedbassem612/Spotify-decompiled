package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class twy0 {
    public String a;

    public final void a(String str) {
        if (u890.j(this.a, str)) {
            this.a = null;
        }
    }

    public final String b() {
        if (this.a != null) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        this.a = string;
        return string;
    }
}
