package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jch implements Serializable {
    public final o8n[] a;

    public jch(o8n[] o8nVarArr) {
        this.a = o8nVarArr;
    }

    private final Object readResolve() {
        o8n[] o8nVarArr = this.a;
        o8n o8nVarY = o6x.a;
        for (o8n o8nVar : o8nVarArr) {
            o8nVarY = o8nVarY.y(o8nVar);
        }
        return o8nVarY;
    }
}
