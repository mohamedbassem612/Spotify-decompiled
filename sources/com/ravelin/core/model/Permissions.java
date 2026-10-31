package com.ravelin.core.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dar;
import p.dm5;
import p.el70;
import p.f46;
import p.h661;
import p.ihc1;
import p.m0v0;
import p.m5n1;
import p.mmr0;
import p.n9v;
import p.nma0;
import p.o661;
import p.p661;
import p.p7h;
import p.pf40;
import p.u890;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;
import p.z6x;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ravelin/core/model/Permissions;", "Landroid/os/Parcelable;", "", "", "granted", "denied", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/Permissions;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "CoM4", "cOm9", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class Permissions implements Parcelable {
    public final List a;
    public final List b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Permissions> CREATOR = new CoM6();
    public static final znb0[] c = {dm5.S(2, new el70((byte) 21)), dm5.S(2, new el70((byte) 22))};

    /* JADX INFO: renamed from: com.ravelin.core.model.Permissions$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Permissions lpt2(Context context) {
            PackageInfo packageInfo;
            Permissions permissions;
            String[] strArr;
            List list = null;
            try {
                packageInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int[] iArr = packageInfo.requestedPermissionsFlags;
                if (iArr != null && (strArr = packageInfo.requestedPermissions) != null) {
                    int i = 0;
                    for (Object obj : f46.W0(strArr, f46.U0(iArr))) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        mmr0 mmr0Var = (mmr0) obj;
                        String str = (String) mmr0Var.a;
                        if ((((Number) mmr0Var.b).intValue() & 2) != 0) {
                            Companion companion = Permissions.INSTANCE;
                            str.getClass();
                            companion.getClass();
                            arrayList.add(ihc1.U0(str, "android.permission.", str));
                        } else {
                            Companion companion2 = Permissions.INSTANCE;
                            str.getClass();
                            companion2.getClass();
                            arrayList2.add(ihc1.U0(str, "android.permission.", str));
                        }
                        i = i2;
                    }
                }
                permissions = new Permissions(arrayList, arrayList2);
            } else {
                permissions = null;
            }
            return permissions == null ? new Permissions(list, list, 3, (DefaultConstructorMarker) list) : permissions;
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ Permissions(int i, List list, List list2, p661 p661Var) {
        int i2 = i & 1;
        z6x z6xVar = z6x.a;
        if (i2 == 0) {
            this.a = z6xVar;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = z6xVar;
        } else {
            this.b = list2;
        }
    }

    public static final /* synthetic */ void lpt2(Permissions self, z1k output, h661 serialDesc) {
        boolean zD0 = output.d0();
        z6x z6xVar = z6x.a;
        znb0[] znb0VarArr = c;
        if (zD0 || !u890.j(self.a, z6xVar)) {
            output.s(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.a);
        }
        if (!output.d0() && u890.j(self.b, z6xVar)) {
            return;
        }
        output.s(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Permissions)) {
            return false;
        }
        Permissions permissions = (Permissions) other;
        return u890.j(this.a, permissions.a) && u890.j(this.b, permissions.b);
    }

    public int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Permissions(granted=" + this.a + ", denied=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(this.a);
        dest.writeStringList(this.b);
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Permissions createFromParcel(Parcel parcel) {
            return new Permissions(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Permissions[] newArray(int i) {
            return new Permissions[i];
        }
    }

    public Permissions(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Permissions(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        List list3 = z6x.a;
        this(i2 != 0 ? list3 : list, (i & 2) != 0 ? list3 : list2);
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.Permissions", com9, 2);
            m0v0Var.j("granted", true);
            m0v0Var.j("denied", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            znb0[] znb0VarArr = Permissions.c;
            return new nma0[]{m5n1.z((nma0) znb0VarArr[0].getValue()), m5n1.z((nma0) znb0VarArr[1].getValue())};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Permissions deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            znb0[] znb0VarArr = Permissions.c;
            x1kVarB.getClass();
            p661 p661Var = null;
            boolean z = true;
            int i = 0;
            List list = null;
            List list2 = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    list = (List) x1kVarB.B(m0v0Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        n9v.a(iP);
                        return null;
                    }
                    list2 = (List) x1kVarB.B(m0v0Var, 1, (nma0) znb0VarArr[1].getValue(), list2);
                    i |= 2;
                }
            }
            x1kVarB.a(m0v0Var);
            return new Permissions(i, list, list2, p661Var);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, Permissions permissions) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            Permissions.lpt2(permissions, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
