package p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ef61 {
    public final en7 a;
    public final String b;
    public ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;

    public ef61(en7 en7Var, String str) {
        this.a = en7Var;
        this.b = str;
    }

    public final synchronized void a(bm5 bm5Var) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (this.c.size() + this.d.size() >= 1000) {
                this.e++;
            } else {
                this.c.add(bm5Var);
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final synchronized void b(boolean z) {
        if (dhn.a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.c.addAll(this.d);
            } catch (Throwable th) {
                dhn.a(this, th);
                return;
            }
        }
        this.d.clear();
        this.e = 0;
    }

    public final synchronized List c() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.c;
            this.c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final int d(md50 md50Var, Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (dhn.a.contains(this)) {
            return 0;
        }
        try {
            try {
                synchronized (this) {
                    try {
                        int i = this.e;
                        y900.b(this.c);
                        this.d.addAll(this.c);
                        this.c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (bm5 bm5Var : this.d) {
                            try {
                                if (z || !bm5Var.c) {
                                    jSONArray.put(bm5Var.a);
                                    jSONArray2.put(bm5Var.b);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            e(md50Var, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    dhn.a(this, th);
                    return 0;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th = th;
        }
    }

    public final void e(md50 md50Var, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (dhn.a.contains(this)) {
                return;
            }
            try {
                jSONObject = tm5.a(sm5.b, this.a, this.b, z, context);
                if (this.e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            md50Var.c = jSONObject;
            Bundle bundle = md50Var.d;
            String string = jSONArray.toString();
            bundle.putString("custom_events", string);
            if (mn10.b(kn10.Y0)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            md50Var.e = string;
            md50Var.d = bundle;
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
