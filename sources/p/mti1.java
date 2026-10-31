package p;

import androidx.xr.runtime.math.Vector3;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mti1 {
    public static float a(Vector3 vector3, Vector3 vector4) {
        Vector3 vector3Minus = vector3.minus(vector4);
        return (float) Math.sqrt((vector3Minus.getZ() * vector3Minus.getZ()) + (vector3Minus.getY() * vector3Minus.getY()) + (vector3Minus.getX() * vector3Minus.getX()));
    }

    public static Vector3 b(Vector3 vector3, Vector3 vector4, float f) {
        return new Vector3(eth.I(vector3.getX(), vector4.getX(), f), eth.I(vector3.getY(), vector4.getY(), f), eth.I(vector3.getZ(), vector4.getZ(), f));
    }
}
