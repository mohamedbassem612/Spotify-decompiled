package p;

import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r4e implements Consumer {
    public final /* synthetic */ tdl0 a;
    public final /* synthetic */ i8h1 b;
    public final /* synthetic */ lzn0 c;
    public final /* synthetic */ boolean d;

    public r4e(tdl0 tdl0Var, i8h1 i8h1Var, lzn0 lzn0Var, boolean z) {
        this.a = tdl0Var;
        this.b = i8h1Var;
        this.c = lzn0Var;
        this.d = z;
    }

    public final void accept(Object obj) {
        u8e u8eVar = ((u4e) obj).c;
        boolean z = u8eVar instanceof t8e;
        lzn0 lzn0Var = this.c;
        i8h1 i8h1Var = this.b;
        tdl0 tdl0Var = this.a;
        if (z) {
            x6h1 x6h1VarC = tdl0Var.b.c();
            x6h1VarC.i.add(new a7h1("podcast_new_episode_notifications_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            lzn0Var.a("spotify:podcast-new-episode-notifications:settings", i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:podcast-new-episode-notifications:settings")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
            return;
        }
        boolean z2 = u8eVar instanceof s8e;
        boolean z3 = this.d;
        if (z2) {
            Parcelable parcelable = ((s8e) u8eVar).a;
            String str = ((rh90) parcelable).b;
            String strM = l1d.m("spotify:settings:notifications:category-details:", str);
            w7h1 w7h1VarA = s4e.a(str, tdl0Var, strM, z3);
            if (w7h1VarA != null) {
                tv80 tv80VarM = i8h1Var.m(w7h1VarA, (xj61) null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("SELECTED_ITEM", parcelable);
                lzn0Var.a(strM, tv80VarM, bundle);
                return;
            }
            return;
        }
        if (!(u8eVar instanceof r8e)) {
            eg.o();
            return;
        }
        Parcelable parcelable2 = ((r8e) u8eVar).a;
        boolean z4 = ((mh90) parcelable2).e;
        String str2 = ((mh90) parcelable2).b;
        if (z4) {
            String strM2 = l1d.m("spotify:settings:notifications:category-details:", str2);
            w7h1 w7h1VarA2 = s4e.a(str2, tdl0Var, strM2, z3);
            if (w7h1VarA2 != null) {
                tv80 tv80VarM2 = i8h1Var.m(w7h1VarA2, (xj61) null);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("SELECTED_ITEM", parcelable2);
                lzn0Var.a(strM2, tv80VarM2, bundle2);
                return;
            }
            return;
        }
        String strM3 = l1d.m("spotify:settings:notifications:collapsed:", str2);
        w7h1 w7h1VarA3 = s4e.a(str2, tdl0Var, strM3, z3);
        if (w7h1VarA3 != null) {
            tv80 tv80VarM3 = i8h1Var.m(w7h1VarA3, (xj61) null);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("SELECTED_GROUP_ITEM", parcelable2);
            lzn0Var.a(strM3, tv80VarM3, bundle3);
        }
    }
}
