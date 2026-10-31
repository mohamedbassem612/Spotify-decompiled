package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class vsw0 implements Parcelable {
    public final int a;
    public final List b;

    public vsw0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public List a() {
        return this.b;
    }
}
