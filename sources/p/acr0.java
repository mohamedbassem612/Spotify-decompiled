package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface acr0 {
    default Set a() {
        return w7x.a;
    }

    Class b();

    Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var);

    default e6w0 d() {
        return a6w0.a;
    }

    default Set e() {
        return w7x.a;
    }

    String getDescription();

    default boolean isEnabled() {
        return true;
    }
}
