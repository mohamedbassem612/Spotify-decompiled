package p;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pm00 {
    public final int a;
    public final int b;
    public final byte[] c;

    public pm00(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static pm00 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(sm00.d0);
        return new pm00(2, bytes, bytes.length, 0);
    }

    public static pm00 b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static pm00 c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[sm00.S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new pm00(4, byteBufferWrap.array(), jArr.length, 0);
    }

    public static pm00 d(rm00[] rm00VarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[sm00.S[5] * rm00VarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (rm00 rm00Var : rm00VarArr) {
            byteBufferWrap.putInt((int) rm00Var.a);
            byteBufferWrap.putInt((int) rm00Var.b);
        }
        return new pm00(5, byteBufferWrap.array(), rm00VarArr.length, 0);
    }

    public static pm00 e(int i, ByteOrder byteOrder) {
        return f(new int[]{i}, byteOrder);
    }

    public static pm00 f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[sm00.S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new pm00(3, byteBufferWrap.array(), iArr.length, 0);
    }

    public final double g(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objJ instanceof String) {
            return Double.parseDouble((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof rm00[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        rm00[] rm00VarArr = (rm00[]) objJ;
        if (rm00VarArr.length == 1) {
            return rm00VarArr[0].a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int h(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof String) {
            return Integer.parseInt((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof String) {
            return (String) objJ;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objJ instanceof rm00[])) {
            return null;
        }
        rm00[] rm00VarArr = (rm00[]) objJ;
        while (i < rm00VarArr.length) {
            sb.append(rm00VarArr[i].a);
            sb.append('/');
            sb.append(rm00VarArr[i].b);
            i++;
            if (i != rm00VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.Serializable, p.rm00[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.io.Serializable, p.rm00[]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v18, types: [double[], java.io.Serializable] */
    public final Serializable j(ByteOrder byteOrder) throws Throwable {
        nm00 nm00Var;
        byte b;
        byte[] bArr = this.c;
        nm00 nm00Var2 = null;
        try {
            nm00Var = new nm00(bArr);
            try {
                nm00Var.b = byteOrder;
                int i = this.a;
                int length = 0;
                int i2 = this.b;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, sm00.d0);
                            try {
                                nm00Var.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= sm00.T.length) {
                            int i3 = 0;
                            while (true) {
                                byte[] bArr2 = sm00.T;
                                if (i3 >= bArr2.length) {
                                    length = bArr2.length;
                                } else if (bArr[i3] == bArr2[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    String string = sb.toString();
                                    nm00Var.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            nm00Var.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r11 = new int[i2];
                        while (length < i2) {
                            r11[length] = nm00Var.readUnsignedShort();
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r11;
                    case 4:
                        ?? r12 = new long[i2];
                        while (length < i2) {
                            r12[length] = ((long) nm00Var.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r12;
                    case 5:
                        ?? r13 = new rm00[i2];
                        while (length < i2) {
                            r13[length] = new rm00(((long) nm00Var.readInt()) & 4294967295L, ((long) nm00Var.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r13;
                    case 8:
                        ?? r14 = new int[i2];
                        while (length < i2) {
                            r14[length] = nm00Var.readShort();
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r14;
                    case 9:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = nm00Var.readInt();
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r15;
                    case 10:
                        ?? r16 = new rm00[i2];
                        while (length < i2) {
                            r16[length] = new rm00(nm00Var.readInt(), nm00Var.readInt());
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r16;
                    case 11:
                        ?? r17 = new double[i2];
                        while (length < i2) {
                            r17[length] = nm00Var.readFloat();
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r17;
                    case 12:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = nm00Var.readDouble();
                            length++;
                        }
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r18;
                    default:
                        try {
                            nm00Var.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (nm00Var != null) {
                    try {
                        nm00Var.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                nm00Var2 = nm00Var;
                if (nm00Var2 != null) {
                    try {
                        nm00Var2.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            nm00Var = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(sm00.R[this.a]);
        sb.append(", data length:");
        return gvg.j(sb, this.c.length, ")");
    }
}
