package androidx.xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.c13;
import p.eth;
import p.gvg;
import p.mmr0;
import p.nti1;
import p.s0z0;
import p.x0d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 52\u00020\u0001:\u00016B1\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020&H\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b.\u0010+R\u0012\u00100\u001a\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0011\u00102\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b1\u0010%R\u001d\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020&8F¢\u0006\u0006\u001a\u0004\b3\u0010(¨\u00067"}, d2 = {"Landroidx/xr/runtime/math/Quaternion;", "", "", "x", "y", "z", "w", "<init>", "(FFFF)V", "other", "(Landroidx/xr/runtime/math/Quaternion;)V", "Lp/nti1;", "vector", "(Lp/nti1;)V", "unaryMinus", "()Landroidx/xr/runtime/math/Quaternion;", "plus", "(Landroidx/xr/runtime/math/Quaternion;)Landroidx/xr/runtime/math/Quaternion;", "minus", "Landroidx/xr/runtime/math/Vector3;", "src", "times", "(Landroidx/xr/runtime/math/Vector3;)Landroidx/xr/runtime/math/Vector3;", "dot", "(Landroidx/xr/runtime/math/Quaternion;)F", "copy", "(FFFF)Landroidx/xr/runtime/math/Quaternion;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "toYawPitchRoll", "()Landroidx/xr/runtime/math/Vector3;", "Lp/mmr0;", "toAxisAngle", "()Lp/mmr0;", "F", "getX", "()F", "getY", "getZ", "getW", "getInverse", "inverse", "getEulerAngles", "eulerAngles", "getAxisAngle", "axisAngle", "Companion", "p/s0z0", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Quaternion {
    private static final float COS_THRESHOLD = 0.9995f;
    private static final float CROSS_EPSILON = 1.0E-6f;
    private static final float EULER_THRESHOLD = 0.49999994f;
    private static final float NORMALIZE_EPSILON = 1.0E-8f;
    private static final float UP_NORMALIZED_THRESHOLD = 0.999f;
    private final float w;
    private final float x;
    private final float y;
    private final float z;
    public static final s0z0 Companion = new s0z0();
    public static final Quaternion Identity = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

    public Quaternion(float f, float f2, float f3, float f4) {
        float fSqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f));
        if (fSqrt < NORMALIZE_EPSILON) {
            this.x = 0.0f;
            this.y = 0.0f;
            this.z = 0.0f;
            this.w = 1.0f;
            return;
        }
        this.x = f / fSqrt;
        this.y = f2 / fSqrt;
        this.z = f3 / fSqrt;
        this.w = f4 / fSqrt;
    }

    public static final float angle(Quaternion quaternion, Quaternion quaternion2) {
        Companion.getClass();
        return ((float) Math.acos(Math.abs(eth.j(s0z0.a(quaternion, quaternion2), -1.0f, 1.0f)))) * 2.0f * 57.295776f;
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = quaternion.x;
        }
        if ((i & 2) != 0) {
            f2 = quaternion.y;
        }
        if ((i & 4) != 0) {
            f3 = quaternion.z;
        }
        if ((i & 8) != 0) {
            f4 = quaternion.w;
        }
        return quaternion.copy(f, f2, f3, f4);
    }

    public static final Quaternion fromAxisAngle(Vector3 vector3, float f) {
        Companion.getClass();
        return s0z0.b(vector3, f);
    }

    public static final Quaternion fromEulerAngles(Vector3 vector3) {
        Companion.getClass();
        Quaternion quaternion = new Quaternion(s0z0.b(Vector3.Up, vector3.getY()));
        Quaternion quaternion2 = new Quaternion(s0z0.b(Vector3.Right, vector3.getX()));
        float x = quaternion.getX();
        float y = quaternion.getY();
        float z = quaternion.getZ();
        float w = quaternion.getW();
        float x2 = quaternion2.getX();
        float y2 = quaternion2.getY();
        float z2 = quaternion2.getZ();
        float w2 = quaternion2.getW();
        Quaternion quaternion3 = new Quaternion(((y * z2) + ((x * w2) + (w * x2))) - (z * y2), (z * x2) + (y * w2) + ((w * y2) - (x * z2)), (z * w2) + (((x * y2) + (w * z2)) - (y * x2)), (((w * w2) - (x * x2)) - (y * y2)) - (z * z2));
        Quaternion quaternion4 = new Quaternion(s0z0.b(Vector3.Backward, vector3.getZ()));
        float x3 = quaternion3.getX();
        float y3 = quaternion3.getY();
        float z3 = quaternion3.getZ();
        float w3 = quaternion3.getW();
        float x4 = quaternion4.getX();
        float y4 = quaternion4.getY();
        float z4 = quaternion4.getZ();
        float w4 = quaternion4.getW();
        return new Quaternion(((y3 * z4) + ((x3 * w4) + (w3 * x4))) - (z3 * y4), (z3 * x4) + (y3 * w4) + ((w3 * y4) - (x3 * z4)), (z3 * w4) + (((x3 * y4) + (w3 * z4)) - (y3 * x4)), (((w3 * w4) - (x3 * x4)) - (y3 * y4)) - (z3 * z4));
    }

    public static final Quaternion fromLookTowards(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        return s0z0.c(vector3, vector4);
    }

    public static final Quaternion fromRotation(Quaternion quaternion, Quaternion quaternion2) {
        Companion.getClass();
        Quaternion quaternion3 = new Quaternion(-quaternion.getX(), -quaternion.getY(), -quaternion.getZ(), quaternion.getW());
        float x = quaternion2.getX();
        float y = quaternion2.getY();
        float z = quaternion2.getZ();
        float w = quaternion2.getW();
        float x2 = quaternion3.getX();
        float y2 = quaternion3.getY();
        float z2 = quaternion3.getZ();
        float w2 = quaternion3.getW();
        return new Quaternion(new Quaternion(((y * z2) + ((x * w2) + (w * x2))) - (z * y2), (z * x2) + (y * w2) + ((w * y2) - (x * z2)), (z * w2) + (((x * y2) + (w * z2)) - (y * x2)), (((w * w2) - (x * x2)) - (y * y2)) - (z * z2)));
    }

    public static final Quaternion lerp(Quaternion quaternion, Quaternion quaternion2, float f) {
        Companion.getClass();
        return s0z0.d(quaternion, quaternion2, f);
    }

    public static final Quaternion slerp(Quaternion quaternion, Quaternion quaternion2, float f) {
        Companion.getClass();
        return s0z0.e(quaternion, quaternion2, f);
    }

    private final mmr0 toAxisAngle() {
        float fAcos = ((float) Math.acos(eth.j(this.w, -1.0f, 1.0f))) * 2.0f;
        float fSin = (float) Math.sin(fAcos / 2.0f);
        return new mmr0(fSin < 1.0E-4f ? Vector3.Right : new Vector3(this.x / fSin, this.y / fSin, this.z / fSin), Float.valueOf(fAcos * 57.295776f));
    }

    private final Vector3 toYawPitchRoll() {
        float f = (this.w * this.x) - (this.y * this.z);
        if (f > EULER_THRESHOLD) {
            return new Vector3(90.0f, (-2.0f) * ((float) Math.atan2(this.z, this.w)) * 57.295776f, 0.0f);
        }
        if (f < -0.49999994f) {
            return new Vector3(-90.0f, 2.0f * ((float) Math.atan2(this.z, this.w)) * 57.295776f, 0.0f);
        }
        float fAsin = (float) Math.asin(f * 2.0f);
        float f2 = this.w;
        float f3 = this.y;
        float f4 = this.x;
        float fAtan2 = (float) Math.atan2(((double) ((this.z * f4) + (f2 * f3))) * 2.0d, 1.0d - ((double) c13.p(f3, f3, f4 * f4, 2.0f)));
        float f5 = this.w;
        float f6 = this.z;
        float f7 = this.x;
        return new Vector3(fAsin * 57.295776f, fAtan2 * 57.295776f, ((float) Math.atan2(2.0d * ((double) ((this.y * f7) + (f5 * f6))), 1.0d - ((double) c13.p(f6, f6, f7 * f7, 2.0f)))) * 57.295776f);
    }

    public final Quaternion copy() {
        return copy$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public final float dot(Quaternion other) {
        return (other.getW() * getW()) + (other.getZ() * getZ()) + (other.getY() * getY()) + (other.getX() * getX());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) other;
        return this.x == quaternion.x && this.y == quaternion.y && this.z == quaternion.z && this.w == quaternion.w;
    }

    public final mmr0 getAxisAngle() {
        return toAxisAngle();
    }

    public final Vector3 getEulerAngles() {
        return toYawPitchRoll();
    }

    public final Quaternion getInverse() {
        return new Quaternion(-getX(), -getY(), -getZ(), getW());
    }

    public final float getW() {
        return this.w;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return Float.hashCode(this.w) + x0d.f(x0d.f(Float.hashCode(this.x) * 31, 31, this.y), 31, this.z);
    }

    public final Quaternion minus(Quaternion other) {
        return new Quaternion(getX() - other.getX(), getY() - other.getY(), getZ() - other.getZ(), getW() - other.getW());
    }

    public final Quaternion plus(Quaternion other) {
        return new Quaternion(other.getX() + getX(), other.getY() + getY(), other.getZ() + getZ(), other.getW() + getW());
    }

    public final Quaternion times(Quaternion other) {
        float x = getX();
        float y = getY();
        float z = getZ();
        float w = getW();
        float x2 = other.getX();
        float y2 = other.getY();
        float z2 = other.getZ();
        float w2 = other.getW();
        return new Quaternion(((y * z2) + ((x * w2) + (w * x2))) - (z * y2), (z * x2) + (y * w2) + ((w * y2) - (x * z2)), (z * w2) + (((x * y2) + (w * z2)) - (y * x2)), (((w * w2) - (x * x2)) - (y * y2)) - (z * z2));
    }

    public String toString() {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.z;
        float f4 = this.w;
        StringBuilder sbM = gvg.m("[x=", f, ", y=", f2, ", z=");
        sbM.append(f3);
        sbM.append(", w=");
        sbM.append(f4);
        sbM.append("]");
        return sbM.toString();
    }

    public final Quaternion unaryMinus() {
        return new Quaternion(-getX(), -getY(), -getZ(), -getW());
    }

    public final Quaternion copy(float f) {
        return copy$default(this, f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final Quaternion copy(float f, float f2) {
        return copy$default(this, f, f2, 0.0f, 0.0f, 12, null);
    }

    public final Quaternion copy(float f, float f2, float f3) {
        return copy$default(this, f, f2, f3, 0.0f, 8, null);
    }

    public final Quaternion copy(float x, float y, float z, float w) {
        return new Quaternion(x, y, z, w);
    }

    public static final float dot(Quaternion quaternion, Quaternion quaternion2) {
        Companion.getClass();
        return s0z0.a(quaternion, quaternion2);
    }

    public Quaternion(float f) {
        this(f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public Quaternion(float f, float f2) {
        this(f, f2, 0.0f, 0.0f, 12, null);
    }

    public Quaternion(float f, float f2, float f3) {
        this(f, f2, f3, 0.0f, 8, null);
    }

    public Quaternion(nti1 nti1Var) {
        throw null;
    }

    public Quaternion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public /* synthetic */ Quaternion(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 1.0f : f4);
    }

    public Quaternion(Quaternion quaternion) {
        this(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }

    public final Vector3 times(Vector3 src) {
        float x = getX();
        float y = getY();
        float z = getZ();
        float w = getW();
        float x2 = src.getX();
        float y2 = src.getY();
        float z2 = src.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        return new Vector3((((y * f3) - (z * f2)) * 2.0f) + x2, (((z * f) - (f3 * x)) * 2.0f) + y2, (2.0f * ((x * f2) - (y * f))) + z2);
    }

    public static final Quaternion fromRotation(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        Vector3 normalized = vector3.toNormalized();
        Vector3 normalized2 = vector4.toNormalized();
        float fDot = normalized.dot(normalized2);
        if (fDot < -0.9995f) {
            Vector3 vector3Cross = Vector3.Backward.cross(normalized);
            if ((vector3Cross.getZ() * vector3Cross.getZ()) + (vector3Cross.getY() * vector3Cross.getY()) + (vector3Cross.getX() * vector3Cross.getX()) < 0.01f) {
                vector3Cross = Vector3.Right.cross(normalized);
            }
            return s0z0.b(vector3Cross, 180.0f);
        }
        Vector3 vector3Cross2 = normalized.cross(normalized2);
        return new Quaternion(vector3Cross2.getX(), vector3Cross2.getY(), vector3Cross2.getZ(), 1.0f + fDot);
    }

    public static final Quaternion fromEulerAngles(float f, float f2, float f3) {
        Companion.getClass();
        Quaternion quaternion = new Quaternion(s0z0.b(Vector3.Up, f2));
        Quaternion quaternion2 = new Quaternion(s0z0.b(Vector3.Right, f));
        float x = quaternion.getX();
        float y = quaternion.getY();
        float z = quaternion.getZ();
        float w = quaternion.getW();
        float x2 = quaternion2.getX();
        float y2 = quaternion2.getY();
        float z2 = quaternion2.getZ();
        float w2 = quaternion2.getW();
        Quaternion quaternion3 = new Quaternion(((y * z2) + ((x * w2) + (w * x2))) - (z * y2), (z * x2) + (y * w2) + ((w * y2) - (x * z2)), (z * w2) + (((x * y2) + (w * z2)) - (y * x2)), (((w * w2) - (x * x2)) - (y * y2)) - (z * z2));
        Quaternion quaternion4 = new Quaternion(s0z0.b(Vector3.Backward, f3));
        float x3 = quaternion3.getX();
        float y3 = quaternion3.getY();
        float z3 = quaternion3.getZ();
        float w3 = quaternion3.getW();
        float x4 = quaternion4.getX();
        float y4 = quaternion4.getY();
        float z4 = quaternion4.getZ();
        float w4 = quaternion4.getW();
        return new Quaternion(((y3 * z4) + ((x3 * w4) + (w3 * x4))) - (z3 * y4), (z3 * x4) + (y3 * w4) + ((w3 * y4) - (x3 * z4)), (z3 * w4) + (((x3 * y4) + (w3 * z4)) - (y3 * x4)), (((w3 * w4) - (x3 * x4)) - (y3 * y4)) - (z3 * z4));
    }
}
