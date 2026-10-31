package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t8a extends z8a {
    public float j;

    public t8a(u8a... u8aVarArr) {
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (u8a u8aVar : u8aVarArr) {
            arrayList.add(u8aVar);
        }
        this.i = arrayList;
        a();
        this.j = 0.85f;
    }
}
