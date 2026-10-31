package p;

import com.google.protobuf.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class myp0 {
    public final Duration a;
    public final Duration b;

    public myp0(Duration duration, Duration duration2) {
        this.a = duration;
        this.b = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myp0)) {
            return false;
        }
        myp0 myp0Var = (myp0) obj;
        return this.a.equals(myp0Var.a) && this.b.equals(myp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
