package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.fkc1[], still in use, count: 1, list:
  (r0v1 p.fkc1[]) from 0x0080: CONSTRUCTOR (r1v2 p.t0z) = (r0v1 p.fkc1[]) (LINE:129) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fkc1 implements Parcelable {
    Volume(2131958679, 2131102362, "mixing_style_category_volume_button", zyb.a),
    Eq(2131958675, 2131102367, "mixing_style_category_eq_button", syb.a),
    Filter(2131958676, 2131102366, "mixing_style_category_filter_button", tyb.a),
    Effects(2131958674, 2131102364, "mixing_style_category_effects_button", uyb.a),
    Looping(2131958678, 2131102365, "mixing_style_category_looping_button", wyb.a),
    Jogwheel(2131958677, 2131102363, "mixing_style_category_jogwheel_button", vyb.a);

    public static final Parcelable.Creator<fkc1> CREATOR;
    public static final /* synthetic */ t0z Y;
    public final int a;
    public final int b;
    public final String c;
    public final azb d;

    static {
        t0z t0zVar = new t0z(fkc1VarArr);
        Y = t0zVar;
        CREATOR = new y7c1((byte) 21);
        mqo1.A(t0zVar);
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            if (!((fkc1) next).a()) {
                arrayList.add(next);
            }
        }
        mqo1.A(arrayList);
        t0z t0zVar2 = Y;
        ArrayList arrayList2 = new ArrayList();
        d7 d7Var2 = new d7(t0zVar2, (byte) 0);
        while (d7Var2.hasNext()) {
            Object next2 = d7Var2.next();
            if (((fkc1) next2).a()) {
                arrayList2.add(next2);
            }
        }
        mqo1.A(arrayList2);
    }

    public fkc1(int i, int i2, String str, azb azbVar) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = azbVar;
    }

    public static fkc1 valueOf(String str) {
        return (fkc1) Enum.valueOf(fkc1.class, str);
    }

    public static fkc1[] values() {
        return (fkc1[]) X.clone();
    }

    public final boolean a() {
        return this == Effects || this == Looping || this == Jogwheel;
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
