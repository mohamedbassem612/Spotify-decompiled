package p;

import android.content.ComponentName;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class di20 extends fi20 {
    public final ComponentName a;

    public di20(ComponentName componentName) {
        this.a = componentName;
    }

    public final ComponentName a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof di20) {
            return this.a.equals(((di20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
