package p;

import java.util.ArrayList;
import java.util.List;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jf21 implements vn90 {
    public final /* synthetic */ byte a = 0;
    public final ArrayList b;
    public final boolean c;
    public final int d;
    public final int e;

    public jf21(ArrayList arrayList, vn90 vn90Var) {
        this.b = arrayList;
        this.c = vn90Var.b();
        this.d = arrayList.size();
        this.e = arrayList.size();
    }

    @Override // p.vn90
    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    @Override // p.vn90
    public final boolean b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // p.vn90
    public final int c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // p.vn90
    public final List getItems() {
        byte b = this.a;
        return this.b;
    }

    public jf21(ArrayList arrayList, CollectionGetUnplayedEpisodesResponse collectionGetUnplayedEpisodesResponse) {
        this.b = arrayList;
        this.c = collectionGetUnplayedEpisodesResponse.o();
        this.d = collectionGetUnplayedEpisodesResponse.p();
        this.e = collectionGetUnplayedEpisodesResponse.q();
    }
}
