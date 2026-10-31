package p;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pj20 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public pj20(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = hhc1.a;
        zod.v("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static pj20 a(Context context) {
        esa1 esa1Var = new esa1(context);
        String strT = esa1Var.t("google_app_id");
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        return new pj20(strT, esa1Var.t("google_api_key"), esa1Var.t("firebase_database_url"), esa1Var.t("ga_trackingId"), esa1Var.t("gcm_defaultSenderId"), esa1Var.t("google_storage_bucket"), esa1Var.t("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj20)) {
            return false;
        }
        pj20 pj20Var = (pj20) obj;
        return k8p1.h(this.b, pj20Var.b) && k8p1.h(this.a, pj20Var.a) && k8p1.h(this.c, pj20Var.c) && k8p1.h(this.d, pj20Var.d) && k8p1.h(this.e, pj20Var.e) && k8p1.h(this.f, pj20Var.f) && k8p1.h(this.g, pj20Var.g);
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        drj0 drj0VarR = k8p1.r(this);
        drj0VarR.d(this.b, "applicationId");
        drj0VarR.d(this.a, "apiKey");
        drj0VarR.d(this.c, "databaseUrl");
        drj0VarR.d(this.e, "gcmSenderId");
        drj0VarR.d(this.f, "storageBucket");
        drj0VarR.d(this.g, "projectId");
        return drj0VarR.toString();
    }
}
