package p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cue0 {
    public final Context a;
    public final q8n b;
    public final idd1 c = new idd1(new jgd0(this, (byte) 18));
    public String d;

    public cue0(Context context, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
    }

    public final void a(iu30 iu30Var) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.getValue();
        if (sharedPreferences == null) {
            return;
        }
        w7x w7xVar = w7x.a;
        w7x stringSet = sharedPreferences.getStringSet("logged_out_usernames", w7xVar);
        if (stringSet != null) {
            w7xVar = stringSet;
        }
        Set setP1 = o7h.p1((Iterable) w7xVar);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putStringSet("logged_out_usernames", (Set) iu30Var.invoke(setP1));
        editorEdit.apply();
    }
}
