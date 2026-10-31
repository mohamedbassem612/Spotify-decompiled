package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a330 implements acr0 {
    public final /* synthetic */ byte a;
    public final gdx0 b;
    public final Set c;

    public a330(gdx0 gdx0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = gdx0Var;
                this.c = Collections.singleton(blc0.he);
                break;
            default:
                this.b = gdx0Var;
                this.c = Collections.singleton(blc0.Hb);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return x230.class;
            default:
                return j0x0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                String stringExtra = intent.getStringExtra("user-name");
                if (stringExtra != null) {
                    return new z230(stringExtra, intent.getStringExtra("dm-hierarchy-uri"));
                }
                hhg1.n("username is required for FollowBackMessageInviteSheetPage");
                return null;
            default:
                String stringExtra2 = intent.getStringExtra("profile_completion_username");
                if (stringExtra2 == null) {
                    hhg1.n("username is required for ProfileCompletionSheetPage");
                    return null;
                }
                String stringExtra3 = intent.getStringExtra("profile_completion_display_name");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                String str = stringExtra3;
                String stringExtra4 = intent.getStringExtra("profile_completion_profile_pic");
                boolean booleanExtra = intent.getBooleanExtra("profile_completion_is_wrapped", false);
                String stringExtra5 = intent.getStringExtra("profile_completion_feature_identifier");
                if (stringExtra5 == null) {
                    stringExtra5 = "UNKNOWN";
                }
                String str2 = stringExtra5;
                String stringExtra6 = intent.getStringExtra("profile_completion_session_id");
                if (stringExtra6 != null) {
                    return new m0x0(stringExtra2, str, stringExtra4, str2, booleanExtra, stringExtra6);
                }
                hhg1.n("sessionId is required for ProfileCompletionSheetPage");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return new b6w0(false);
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A bottom sheet that invites the user to send a message to someone who followed them back";
            default:
                return "A bottom sheet for the profile completion flow using Page API";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        gdx0 gdx0Var = this.b;
        switch (b) {
            case 0:
                return gdx0Var.a.l();
            default:
                return gdx0Var.a.o();
        }
    }
}
