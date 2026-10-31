package app.p000rive;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b0k;
import p.f4i1;
import p.u890;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/rive/RiveFileSource;", "", "Bytes", "RawRes", "Lapp/rive/RiveFileSource$Bytes;", "Lapp/rive/RiveFileSource$RawRes;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RiveFileSource {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/RiveFileSource$Bytes;", "Lapp/rive/RiveFileSource;", "data", "", "constructor-impl", "([B)[B", "getData", "()[B", "equals", "", "other", "", "equals-impl", "([BLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "([B)I", "toString", "", "toString-impl", "([B)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Bytes implements RiveFileSource {
        private final byte[] data;

        private /* synthetic */ Bytes(byte[] bArr) {
            this.data = bArr;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bytes m58boximpl(byte[] bArr) {
            return new Bytes(bArr);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static byte[] m59constructorimpl(byte[] bArr) {
            return bArr;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m60equalsimpl(byte[] bArr, Object obj) {
            return (obj instanceof Bytes) && u890.j(bArr, ((Bytes) obj).m64unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m61equalsimpl0(byte[] bArr, byte[] bArr2) {
            return u890.j(bArr, bArr2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m62hashCodeimpl(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m63toStringimpl(byte[] bArr) {
            return f4i1.f("Bytes(data=", Arrays.toString(bArr), ")");
        }

        public boolean equals(Object obj) {
            return m60equalsimpl(this.data, obj);
        }

        public final byte[] getData() {
            return this.data;
        }

        public int hashCode() {
            return m62hashCodeimpl(this.data);
        }

        public String toString() {
            return m63toStringimpl(this.data);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ byte[] m64unboximpl() {
            return this.data;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lapp/rive/RiveFileSource$RawRes;", "Lapp/rive/RiveFileSource;", "resId", "", "resources", "Landroid/content/res/Resources;", "(ILandroid/content/res/Resources;)V", "getResId", "()I", "getResources", "()Landroid/content/res/Resources;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RawRes implements RiveFileSource {
        private final int resId;
        private final Resources resources;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/rive/RiveFileSource$RawRes$Companion;", "", "<init>", "()V", "", "resId", "Lapp/rive/RiveFileSource$RawRes;", "from", "(ILp/b0k;I)Lapp/rive/RiveFileSource$RawRes;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RawRes from(int i, b0k b0kVar, int i2) {
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(1324192287);
                RawRes rawRes = new RawRes(i, ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources());
                x340Var.r(false);
                return rawRes;
            }

            private Companion() {
            }
        }

        public RawRes(int i, Resources resources) {
            this.resId = i;
            this.resources = resources;
        }

        public static /* synthetic */ RawRes copy$default(RawRes rawRes, int i, Resources resources, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rawRes.resId;
            }
            if ((i2 & 2) != 0) {
                resources = rawRes.resources;
            }
            return rawRes.copy(i, resources);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Resources getResources() {
            return this.resources;
        }

        public final RawRes copy(int resId, Resources resources) {
            return new RawRes(resId, resources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawRes)) {
                return false;
            }
            RawRes rawRes = (RawRes) other;
            return this.resId == rawRes.resId && u890.j(this.resources, rawRes.resources);
        }

        public final int getResId() {
            return this.resId;
        }

        public final Resources getResources() {
            return this.resources;
        }

        public int hashCode() {
            return this.resources.hashCode() + (Integer.hashCode(this.resId) * 31);
        }

        public String toString() {
            return "RawRes(resId=" + this.resId + ", resources=" + this.resources + ")";
        }
    }
}
