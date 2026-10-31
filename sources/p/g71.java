package p;

import android.content.Intent;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g71 implements Function, djy0 {
    public final Intent a;

    public String a() {
        String stringExtra = this.a.getStringExtra("REDIRECT_URI");
        return stringExtra != null ? stringExtra : "";
    }

    public Object apply(Object obj) {
        return this.a;
    }

    public String d() {
        return this.a.getStringExtra("CODE_CHALLENGE_METHOD");
    }

    public int e() {
        String stringExtra = this.a.getStringExtra("RESPONSE_TYPE");
        if (stringExtra == null) {
            return 4;
        }
        if (stringExtra.equals("token")) {
            return 1;
        }
        if (stringExtra.equals("code")) {
            return 2;
        }
        return stringExtra.equals("none") ? 3 : 4;
    }

    public boolean f() {
        return false;
    }

    public String getClientId() {
        String stringExtra = this.a.getStringExtra("CLIENT_ID");
        return stringExtra != null ? stringExtra : "";
    }

    public String getState() {
        return this.a.getStringExtra("STATE");
    }

    public String i() {
        return this.a.getStringExtra("UTM_CAMPAIGN");
    }

    public String j() {
        return this.a.getStringExtra("UTM_SOURCE");
    }

    public xig k() {
        return this.a.getParcelableExtra("CLIENT_IDENTITY");
    }

    public String m() {
        return this.a.getStringExtra("associated_content");
    }

    public String n() {
        return this.a.getStringExtra("CODE_CHALLENGE");
    }

    public String[] q() {
        String[] stringArrayExtra = this.a.getStringArrayExtra("SCOPES");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    public String r() {
        return this.a.getStringExtra("UTM_MEDIUM");
    }
}
