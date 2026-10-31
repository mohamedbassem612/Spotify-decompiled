package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface d380 extends List, Collection, ola0 {
    @Override // java.util.List
    default d380 subList(int i, int i2) {
        return new a380(this, i, i2);
    }
}
