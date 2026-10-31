package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k3v implements rhh0 {
    public final Context a;
    public final mwm1 b;
    public final e821 c;
    public final Observable d;
    public final r2a1 e;
    public final Observable f;

    public k3v(Context context, mwm1 mwm1Var, e821 e821Var, Observable observable, r2a1 r2a1Var, Observable observable2) {
        this.a = context;
        this.b = mwm1Var;
        this.c = e821Var;
        this.d = observable;
        this.e = r2a1Var;
        this.f = observable2;
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        return this.f.map(new jut(r9cVar, this, (byte) 8)).switchMap(new efr(this, (byte) 18));
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        return this.f.map(new jut(r9cVar, this, (byte) 8)).switchMap(new rmr(this, (byte) 18)).firstOrError();
    }

    public final z310 c(YourLibraryResponse yourLibraryResponse, ywm1 ywm1Var) {
        ArrayList arrayListF = e821.f(this.c, yourLibraryResponse, true, false, false, false, 224);
        Context context = this.a;
        return new z310(arrayListF, new f410(12, context.getString(2131953991), qxy0.E(ywm1Var, context), (List) null));
    }
}
