package p;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s081 {
    public final t081 a;

    public s081(Context context, ShortcutInfo shortcutInfo) {
        mrs0[] mrs0VarArr;
        String string;
        t081 t081Var = new t081();
        this.a = t081Var;
        t081Var.a = context;
        t081Var.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        t081Var.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        t081Var.d = shortcutInfo.getActivity();
        t081Var.e = shortcutInfo.getShortLabel();
        t081Var.f = shortcutInfo.getLongLabel();
        t081Var.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        t081Var.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        rre0 rre0Var = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            mrs0VarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            mrs0VarArr = new mrs0[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                mrs0 mrs0Var = new mrs0();
                mrs0Var.a = string2;
                mrs0Var.b = null;
                mrs0Var.c = string3;
                mrs0Var.d = string4;
                mrs0Var.e = z;
                mrs0Var.f = z2;
                mrs0VarArr[i2] = mrs0Var;
                i2 = i3;
            }
        }
        t081Var.i = mrs0VarArr;
        shortcutInfo.getUserHandle();
        this.a.o = shortcutInfo.getLastChangedTimestamp();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        t081 t081Var2 = this.a;
        if (i4 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                rre0Var = new rre0(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            o0c.p(locusId, "locusId cannot be null");
            String id = locusId.getId();
            if (TextUtils.isEmpty(id)) {
                hhg1.n("id cannot be empty");
                throw null;
            }
            rre0Var = new rre0(id);
        }
        t081Var2.k = rre0Var;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final t081 a() {
        t081 t081Var = this.a;
        if (TextUtils.isEmpty(t081Var.e)) {
            hhg1.n("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = t081Var.c;
        if (intentArr != null && intentArr.length != 0) {
            return t081Var;
        }
        hhg1.n("Shortcut must have an intent");
        return null;
    }

    public final void b(IconCompat iconCompat) {
        this.a.h = iconCompat;
    }

    public final void c(Intent intent) {
        this.a.c = new Intent[]{intent};
    }

    public final void d() {
        this.a.l = true;
    }

    public final void e(CharSequence charSequence) {
        this.a.e = charSequence;
    }

    public s081(Context context, String str) {
        t081 t081Var = new t081();
        this.a = t081Var;
        t081Var.a = context;
        t081Var.b = str;
    }
}
