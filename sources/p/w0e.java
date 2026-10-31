package p;

import android.text.TextUtils;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w0e extends kkn {
    public final /* synthetic */ byte e;
    public final List f;
    public final ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0e(List list, ArrayList arrayList, byte b) {
        super(false);
        this.e = b;
        this.f = list;
        this.g = arrayList;
    }

    public final boolean i(int i, int i2) {
        byte b = this.e;
        ArrayList arrayList = this.g;
        List list = this.f;
        switch (b) {
            case 0:
                ContextTrack contextTrack = ((u0e) list.get(i)).a;
                ContextTrack contextTrack2 = ((u0e) arrayList.get(i2)).a;
                return TextUtils.equals((CharSequence) contextTrack.metadata().get("title"), (CharSequence) contextTrack2.metadata().get("title")) && u890.j(l4o1.r(contextTrack), l4o1.r(contextTrack2)) && s3o1.v(contextTrack, false) == s3o1.v(contextTrack2, false);
            default:
                return u890.j(((z8e) list.get(i)).a, ((z8e) arrayList.get(i2)).a);
        }
    }

    public final boolean j(int i, int i2) {
        String str;
        byte b = this.e;
        ArrayList arrayList = this.g;
        List list = this.f;
        switch (b) {
            case 0:
                u0e u0eVar = (u0e) list.get(i);
                u0e u0eVar2 = (u0e) arrayList.get(i2);
                znf1 znf1Var = u0eVar.c;
                znf1 znf1Var2 = u0eVar2.c;
                String str2 = znf1Var.a;
                return (str2 == null || (str = znf1Var2.a) == null) ? znf1Var.b.equals(znf1Var2.b) : str2.equals(str);
            default:
                return who1.t(((z8e) list.get(i)).a).equals(who1.t(((z8e) arrayList.get(i2)).a));
        }
    }

    public final int q() {
        byte b = this.e;
        ArrayList arrayList = this.g;
        switch (b) {
            case 0:
                break;
        }
        return arrayList.size();
    }

    public final int r() {
        byte b = this.e;
        List list = this.f;
        switch (b) {
            case 0:
                break;
        }
        return list.size();
    }
}
