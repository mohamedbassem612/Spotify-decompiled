package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.m9m[], still in use, count: 1, list:
  (r0v1 p.m9m[]) from 0x002c: CONSTRUCTOR (r0v1 p.m9m[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m9m implements Parcelable {
    MUSIC("music"),
    PODCASTS("podcasts"),
    AUDIOBOOKS("audiobooks");

    public static final Parcelable.Creator<m9m> CREATOR = new hbn1((byte) 10);
    public static final /* synthetic */ t0z f;
    public final String a;

    static {
        f = new t0z(new m9m[]{r0, r1, r2});
    }

    public m9m(String str) {
        super(str, i);
        this.a = str;
    }

    public static m9m valueOf(String str) {
        return (m9m) Enum.valueOf(m9m.class, str);
    }

    public static m9m[] values() {
        return (m9m[]) e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
