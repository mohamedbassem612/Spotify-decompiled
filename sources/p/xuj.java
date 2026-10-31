package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xuj implements i8l {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ xuj(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new rtj(context, new j2i(702741232, new gk0((cir0) obj3, (yuj) obj2, (j2i) obj, (byte) 7), true));
            case 1:
                return new rtj(context, new j2i(683537447, new gk0((cir0) obj3, (kyj) obj2, (j2i) obj, (byte) 8), true));
            case 2:
                hur hurVar = (hur) obj3;
                return new fsg0(new goq(viewGroup, layoutInflater, (iir) hurVar.b, (arp) hurVar.c), (r1q0) obj2, (PublishSubject) obj);
            default:
                return new e061(layoutInflater.inflate(2131626122, viewGroup, false), (e7q) obj3, (dx0) obj2, (nt21) obj);
        }
    }
}
