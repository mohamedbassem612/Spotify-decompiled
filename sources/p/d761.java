package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d761 implements Parcelable {
    public static final Parcelable.Creator<d761> CREATOR = new ge51((byte) 23);
    public final byte[] a;
    public final transient idd1 b = new idd1(new l451(this, (byte) 13));

    public d761(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean a() {
        int iU = b().u();
        int i = iU == 0 ? -1 : c761.a[l1d.C(iU)];
        if (i == 1) {
            return b().p().x();
        }
        if (i == 2) {
            return b().r().w();
        }
        if (i != 3) {
            return false;
        }
        return b().q().w();
    }

    public final Paragraph b() {
        return (Paragraph) this.b.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (d761.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.a, ((d761) obj).a);
        }
        return false;
    }

    public final vnr0 g(djc0 djc0Var, b0k b0kVar, int i) {
        djc0 cjc0Var = (i & 1) != 0 ? bjc0.a : djc0Var;
        Paragraph paragraphB = b();
        int iU = paragraphB.u();
        int i2 = iU == 0 ? -1 : apr0.a[l1d.C(iU)];
        if (i2 == 1) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1020868711);
            Paragraph.Hero heroP = paragraphB.p();
            lee1 lee1VarG = bpr0.g(heroP.s(), x340Var);
            if (heroP.r() > 0) {
                cjc0Var = new cjc0(heroP.r());
            }
            djc0 djc0Var2 = cjc0Var;
            String strU = heroP.s().u();
            long jB = bpr0.b(heroP.s().w());
            eor0 eor0VarD = bpr0.d(heroP.u());
            Paragraph.AutoSize autoSizeN = heroP.n();
            vnr0 vnr0Var = new vnr0(strU, lee1VarG, new jor0(eor0VarD, (autoSizeN.q() == 0.0f && autoSizeN.p() == 0.0f) ? for0.a : new gor0(autoSizeN.q(), autoSizeN.p(), 8, 0, fc11.G(autoSizeN.n())), djc0Var2, bpr0.a(heroP.o()), heroP.x() ? bpr0.c(heroP.q()) : null, heroP.t()), jB, (a0e1) null);
            x340Var.r(false);
            return vnr0Var;
        }
        if (i2 == 2) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1020870855);
            Paragraph.Single singleR = paragraphB.r();
            lee1 lee1VarG2 = bpr0.g(singleR.s(), x340Var2);
            if (singleR.r() > 0) {
                cjc0Var = new cjc0(singleR.r());
            }
            vnr0 vnr0Var2 = new vnr0(singleR.s().u(), lee1VarG2, new jor0(bpr0.d(singleR.u()), cjc0Var, bpr0.a(singleR.o()), singleR.w() ? bpr0.c(singleR.q()) : null, singleR.t(), 2), bpr0.b(singleR.s().w()), bpr0.e(singleR.n()));
            x340Var2.r(false);
            return vnr0Var2;
        }
        if (i2 != 3) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(1020873965);
            lee1 lee1VarG3 = bpr0.g(paragraphB.s(), x340Var3);
            x340Var3.i0(586233347);
            h290<Paragraph.TextStyle> h290VarT = paragraphB.t();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarT, 10));
            for (Paragraph.TextStyle textStyle : h290VarT) {
                arrayList.add(new mor0(textStyle.u(), bpr0.g(textStyle, x340Var3).a));
            }
            x340Var3.r(false);
            vnr0 vnr0Var3 = new vnr0(paragraphB.s().u(), lee1VarG3, arrayList.isEmpty() ? new jor0((eor0) null, cjc0Var, (tnr0) null, (bor0) null, 0.0f, 59) : new ior0(arrayList, new tnr0(), null, cjc0Var), bpr0.b(paragraphB.s().w()), (a0e1) null);
            x340Var3.r(false);
            return vnr0Var3;
        }
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.i0(1020872935);
        Paragraph.Multi multiQ = paragraphB.q();
        lee1 lee1VarG4 = bpr0.g(multiQ.t(), x340Var4);
        if (multiQ.s() > 0) {
            cjc0Var = new cjc0(multiQ.s());
        }
        x340Var4.i0(62978677);
        h290<Paragraph.TextStyle> h290VarU = multiQ.u();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarU, 10));
        for (Paragraph.TextStyle textStyle2 : h290VarU) {
            arrayList2.add(new mor0(textStyle2.u(), bpr0.g(textStyle2, x340Var4).a));
        }
        x340Var4.r(false);
        vnr0 vnr0Var4 = new vnr0(multiQ.t().u(), lee1VarG4, new ior0(arrayList2, bpr0.a(multiQ.p()), multiQ.w() ? bpr0.c(multiQ.r()) : null, cjc0Var), bpr0.b(multiQ.t().w()), bpr0.e(multiQ.o()));
        x340Var4.r(false);
        return vnr0Var4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }
}
