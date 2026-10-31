package p;

import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest;
import com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uo30 implements vn90 {
    public final /* synthetic */ byte a = 0;
    public final ArrayList b;
    public final int c;
    public final int d;

    public uo30(ArrayList arrayList, GetUnfinishedEpisodesResponse getUnfinishedEpisodesResponse) {
        this.b = arrayList;
        this.c = getUnfinishedEpisodesResponse.n().o();
        this.d = getUnfinishedEpisodesResponse.n().o();
    }

    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final boolean b() {
        switch (this.a) {
        }
        return false;
    }

    public final int c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final List getItems() {
        byte b = this.a;
        return this.b;
    }

    public uo30(ArrayList arrayList, ShowUnfinishedEpisodesRequest.Response response) {
        this.b = arrayList;
        this.c = response.n();
        this.d = response.n();
    }
}
