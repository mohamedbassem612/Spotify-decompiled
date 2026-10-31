package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kfz extends mfz implements Serializable {
    public static final kfz a = new kfz();

    private Object readResolve() {
        return a;
    }
}
