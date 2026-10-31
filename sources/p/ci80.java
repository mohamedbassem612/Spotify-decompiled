package p;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ci80 {
    public final InputConfiguration a;

    public ci80(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ci80)) {
            return false;
        }
        return Objects.equals(this.a, ((ci80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
