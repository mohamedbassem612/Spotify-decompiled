package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qa61 {
    public static final qa61 b = new qa61(new HashSet());
    public static final String c;
    public final t380 a;

    static {
        String str = zoi1.a;
        c = Integer.toString(0, 36);
    }

    public qa61(HashSet hashSet) {
        this.a = t380.p(hashSet);
    }

    public static qa61 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            oon1.H("Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(pa61.a((Bundle) parcelableArrayList.get(i)));
        }
        return new qa61(hashSet);
    }

    public final dr41 a() {
        return new dr41(this);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        mjh1 mjh1VarK = this.a.k();
        while (mjh1VarK.hasNext()) {
            arrayList.add(((pa61) mjh1VarK.next()).b());
        }
        bundle.putParcelableArrayList(c, arrayList);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qa61) {
            return this.a.equals(((qa61) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
