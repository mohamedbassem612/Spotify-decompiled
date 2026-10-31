package p;

import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class to11 {
    public final Calendar a;

    public to11(Calendar calendar) {
        this.a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to11) && u890.j(this.a, ((to11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
