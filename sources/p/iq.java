package p;

import android.content.Context;
import android.content.SharedPreferences;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
public final class iq {
    public final Context a;
    public final fha0 b;
    public final sr c;
    public final q8n d;
    public final long e;
    public final boolean f;
    public final idd1 g = new idd1(new eq(this));
    public final idd1 h = new idd1(new vp(this));

    public iq(Context context, fha0 fha0Var, sr srVar, q8n q8nVar, long j, boolean z) {
        this.a = context;
        this.b = fha0Var;
        this.c = srVar;
        this.d = q8nVar;
        this.e = j;
        this.f = z;
    }

    public static void e(String str, Exception exc) {
        if (exc.getMessage() == null) {
            exc = new Exception(str);
        }
        String message = exc.getMessage();
        if (message != null) {
            Logger.e(exc, str + ": " + message, new Object[0]);
        }
    }

    public final lw a(String str, String str2) {
        if (str2 != null) {
            try {
                return ((sw) this.g.getValue()).a(str2);
            } catch (IOException e) {
                n57.t("Could not deserialize stored account", e);
                f(str);
                Logger.e(e, "AccountSwitching: Could not read user info for ".concat(str), new Object[0]);
            }
        }
        return null;
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.h.getValue();
    }

    public final List c() {
        return d(this.f ? b() : (SharedPreferences) c921.D(new gq(this, c921.q(smo1.e(this.d), (o8n) null, 0, new wp(this, (lnm) null, (byte) 1), 3), (lnm) null)));
    }

    public final List d(SharedPreferences sharedPreferences) {
        Map<String, ?> all;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            lw lwVarA = a(key, value instanceof String ? (String) value : null);
            if (lwVarA != null) {
                arrayList.add(lwVarA);
            }
        }
        return arrayList;
    }

    public final void f(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null || (editorEdit = sharedPreferencesB.edit()) == null || (editorRemove = editorEdit.remove(str)) == null) {
            return;
        }
        editorRemove.apply();
    }

    public final int g() {
        Map<String, ?> all;
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null || (all = sharedPreferencesB.getAll()) == null) {
            return 0;
        }
        return all.size();
    }
}
