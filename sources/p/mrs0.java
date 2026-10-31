package p;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mrs0 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static mrs0 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        mrs0 mrs0Var = new mrs0();
        mrs0Var.a = charSequence;
        mrs0Var.b = iconCompatA;
        mrs0Var.c = string;
        mrs0Var.d = string2;
        mrs0Var.e = z;
        mrs0Var.f = z2;
        return mrs0Var;
    }

    public final IconCompat b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final CharSequence d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mrs0)) {
            return false;
        }
        mrs0 mrs0Var = (mrs0) obj;
        String str = this.d;
        String str2 = mrs0Var.d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.a), Objects.toString(mrs0Var.a)) && Objects.equals(this.c, mrs0Var.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(mrs0Var.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(mrs0Var.f));
        }
        return Objects.equals(str, str2);
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final Person h() {
        return rh5.c(this);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final PersistableBundle j() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.c);
        persistableBundle.putString("key", this.d);
        persistableBundle.putBoolean("isBot", this.e);
        persistableBundle.putBoolean("isImportant", this.f);
        return persistableBundle;
    }
}
