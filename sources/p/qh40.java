package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qh40 extends mby {
    public final zxl1 b;
    public final Uri c;
    public final Boolean d;
    public final bg11 e;
    public final Boolean f;
    public final bg11 g;

    public /* synthetic */ qh40(wmy wmyVar) {
        super(40);
        this.b = new zxl1((frl1) wmyVar.a);
        this.c = (Uri) wmyVar.b;
        this.d = (Boolean) wmyVar.c;
        this.e = ((v280) wmyVar.d).g();
        this.f = (Boolean) wmyVar.e;
        this.g = ((v280) wmyVar.f).g();
    }

    @Override // p.mby
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("E_T", this.a);
        Bundle bundle2 = new Bundle();
        zxl1 zxl1Var = this.b;
        bundle2.putBundle("A", ((bym1) zxl1Var.b).d());
        String str = (String) zxl1Var.c;
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("B", str);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("C", null);
        }
        bundle.putBundle("A", bundle2);
        Uri uri = this.c;
        if (uri != null) {
            bundle.putParcelable("B", uri);
        }
        Boolean bool = this.d;
        if (bool != null) {
            bundle.putBoolean("D", bool.booleanValue());
        }
        bundle.putInt("G", 0);
        bg11 bg11Var = this.e;
        if (!bg11Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int i = bg11Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                fku fkuVar = (fku) bg11Var.get(i2);
                Bundle bundle3 = new Bundle();
                Long l = fkuVar.a;
                if (l != null) {
                    bundle3.putLong("B", l.longValue());
                }
                arrayList.add(bundle3);
            }
            bundle.putParcelableArrayList("L", arrayList);
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            bundle.putBoolean("N", bool2.booleanValue());
        }
        bg11 bg11Var2 = this.g;
        if (!bg11Var2.isEmpty()) {
            bundle.putStringArray("E", (String[]) bg11Var2.toArray(new String[0]));
        }
        return bundle;
    }
}
