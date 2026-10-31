package p;

import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.recaptcha.internal.zzalr;
import com.google.android.recaptcha.internal.zzals;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class x4n1 implements wa00 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzalr */
    public static /* synthetic */ void a() throws zzalr {
        throw new zzalr();
    }

    public static /* synthetic */ void b(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void d(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Length too large: ");
        sb.append(i2);
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void e(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void f(int i, Object obj, int i2, Object obj2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzals */
    public static /* synthetic */ void g(String str) throws zzals {
        throw new zzals(str);
    }

    public static /* synthetic */ void h(int i, Object obj, int i2, Object obj2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.play_billing.zzgc */
    public static /* synthetic */ void i(String str) throws zzgc {
        throw new zzgc(str);
    }

    public xa00 c(jf01 jf01Var) {
        return xa00.a;
    }
}
