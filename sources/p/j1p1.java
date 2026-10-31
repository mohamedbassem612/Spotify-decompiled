package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.common.MlKitException;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.model.command.options.PlayOperation;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PlayTrigger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j1p1 {
    public static b180 a;
    public static b180 b;

    public static Bitmap A(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.mlkit.common.MlKitException */
    public static byte[] B(int i, byte[] bArr, int i2) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    } catch (Exception unused) {
                        throw th;
                    }
                }
            }
        } catch (IOException e) {
            throw new MlKitException("Image conversion error from NV21 format", e);
        }
    }

    public static final void C(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int rowStride2 = 0;
        for (int i6 = 0; i6 < rowStride; i6++) {
            int pixelStride = rowStride2;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i3] = buffer.get(pixelStride);
                i3 += i4;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void a(int i, int i2, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        Function0 function1;
        int i7;
        boolean z5;
        b0k b0kVar2;
        boolean z6;
        boolean z7;
        Function0 function2;
        h311 h311VarV;
        boolean z8;
        Function0 function3;
        float f;
        float f2;
        float f3;
        int i8;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1688251062);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= b0kVar3.h(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z4 = z2;
                    if (b0kVar3.h(z4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        function1 = function0;
                        if (b0kVar3.i(function1)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 9363) != 9362) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z5)) {
                        if (i9 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i4 != 0) {
                            z8 = true;
                        } else {
                            z8 = z4;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(b0kVar3).f;
                        if (z6) {
                            f = 16.0f;
                        } else {
                            f = 0.0f;
                        }
                        if (z6) {
                            f2 = 16.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        if (z8) {
                            f3 = 16.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        cr31 cr31VarC = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                        mgx mgxVar = mgx.e;
                        zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        cvx cvxVar = cbx.b(b0kVar3).b;
                        b0kVar2 = b0kVar3;
                        cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC, mgxVar, zzq0Var, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                        boolean z9 = z8;
                        function2 = function3;
                        z7 = z9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        z6 = z3;
                        z7 = z4;
                        function2 = function1;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
                    }
                }
                i3 |= 3072;
                function1 = function0;
                if ((i & 24576) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i3 & 1, z5)) {
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i4 != 0) {
                        z8 = true;
                    } else {
                        z8 = z4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar2 = cbx.b(b0kVar3).f;
                    if (z6) {
                        f = 16.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (z6) {
                        f2 = 16.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (z8) {
                        f3 = 16.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    cr31 cr31VarC2 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                    mgx mgxVar2 = mgx.e;
                    zzq0 zzq0Var2 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC2, mgxVar2, zzq0Var2, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                    boolean z10 = z8;
                    function2 = function3;
                    z7 = z10;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z3;
                    z7 = z4;
                    function2 = function1;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
                }
            }
            i3 |= 384;
            z4 = z2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function1 = function0;
                    if (b0kVar3.i(function1)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i3 & 1, z5)) {
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i4 != 0) {
                        z8 = true;
                    } else {
                        z8 = z4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar3 = cbx.b(b0kVar3).f;
                    if (z6) {
                        f = 16.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (z6) {
                        f2 = 16.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (z8) {
                        f3 = 16.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    cr31 cr31VarC3 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                    mgx mgxVar3 = mgx.e;
                    zzq0 zzq0Var3 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC3, mgxVar3, zzq0Var3, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                    boolean z11 = z8;
                    function2 = function3;
                    z7 = z11;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z3;
                    z7 = z4;
                    function2 = function1;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
                }
            }
            i3 |= 3072;
            function1 = function0;
            if ((i & 24576) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i3 & 1, z5)) {
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i4 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                uwr uwrVar4 = cbx.a;
                cua cuaVar4 = cbx.b(b0kVar3).f;
                if (z6) {
                    f = 16.0f;
                } else {
                    f = 0.0f;
                }
                if (z6) {
                    f2 = 16.0f;
                } else {
                    f2 = 0.0f;
                }
                if (z8) {
                    f3 = 16.0f;
                } else {
                    f3 = 0.0f;
                }
                cr31 cr31VarC4 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                mgx mgxVar4 = mgx.e;
                zzq0 zzq0Var4 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC4, mgxVar4, zzq0Var4, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                boolean z12 = z8;
                function2 = function3;
                z7 = z12;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z3;
                z7 = z4;
                function2 = function1;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
            }
        }
        i3 |= 48;
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z4 = z2;
                if (b0kVar3.h(z4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function1 = function0;
                    if (b0kVar3.i(function1)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i3 & 1, z5)) {
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i4 != 0) {
                        z8 = true;
                    } else {
                        z8 = z4;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar5 = cbx.b(b0kVar3).f;
                    if (z6) {
                        f = 16.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (z6) {
                        f2 = 16.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (z8) {
                        f3 = 16.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    cr31 cr31VarC5 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                    mgx mgxVar5 = mgx.e;
                    zzq0 zzq0Var5 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC5, mgxVar5, zzq0Var5, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                    boolean z13 = z8;
                    function2 = function3;
                    z7 = z13;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z3;
                    z7 = z4;
                    function2 = function1;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
                }
            }
            i3 |= 3072;
            function1 = function0;
            if ((i & 24576) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i3 & 1, z5)) {
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i4 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                uwr uwrVar6 = cbx.a;
                cua cuaVar6 = cbx.b(b0kVar3).f;
                if (z6) {
                    f = 16.0f;
                } else {
                    f = 0.0f;
                }
                if (z6) {
                    f2 = 16.0f;
                } else {
                    f2 = 0.0f;
                }
                if (z8) {
                    f3 = 16.0f;
                } else {
                    f3 = 0.0f;
                }
                cr31 cr31VarC6 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                mgx mgxVar6 = mgx.e;
                zzq0 zzq0Var6 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC6, mgxVar6, zzq0Var6, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                boolean z14 = z8;
                function2 = function3;
                z7 = z14;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z3;
                z7 = z4;
                function2 = function1;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
            }
        }
        i3 |= 384;
        z4 = z2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                if (b0kVar3.i(function1)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i3 & 1, z5)) {
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i4 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                uwr uwrVar7 = cbx.a;
                cua cuaVar7 = cbx.b(b0kVar3).f;
                if (z6) {
                    f = 16.0f;
                } else {
                    f = 0.0f;
                }
                if (z6) {
                    f2 = 16.0f;
                } else {
                    f2 = 0.0f;
                }
                if (z8) {
                    f3 = 16.0f;
                } else {
                    f3 = 0.0f;
                }
                cr31 cr31VarC7 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
                mgx mgxVar7 = mgx.e;
                zzq0 zzq0Var7 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                cvx cvxVar7 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC7, mgxVar7, zzq0Var7, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
                boolean z15 = z8;
                function2 = function3;
                z7 = z15;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z3;
                z7 = z4;
                function2 = function1;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
            }
        }
        i3 |= 3072;
        function1 = function0;
        if ((i & 24576) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) != 9362) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (b0kVar3.Y(i3 & 1, z5)) {
            if (i9 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i4 != 0) {
                z8 = true;
            } else {
                z8 = z4;
            }
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            uwr uwrVar8 = cbx.a;
            cua cuaVar8 = cbx.b(b0kVar3).f;
            if (z6) {
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            if (z6) {
                f2 = 16.0f;
            } else {
                f2 = 0.0f;
            }
            if (z8) {
                f3 = 16.0f;
            } else {
                f3 = 0.0f;
            }
            cr31 cr31VarC8 = er31.c(f, f2, z8 ? 16.0f : 0.0f, f3);
            mgx mgxVar8 = mgx.e;
            zzq0 zzq0Var8 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            cvx cvxVar8 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(uyn1.z(8.0f, 0.0f, 2, qim0Var), (tl3) null, cr31VarC8, mgxVar8, zzq0Var8, (max) null, true, (idn0) null, (ga80) null, function3 != null ? new gbx(z50.c, function3) : null, (gbx) null, apo.r(1981789997, new rv71(j2iVar, (byte) 2), b0kVar3), b0kVar2, 1600512, 48, 1442);
            boolean z16 = z8;
            function2 = function3;
            z7 = z16;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z6 = z3;
            z7 = z4;
            function2 = function1;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tc0(qim0Var, z6, z7, function2, j2iVar, i, i2);
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2043807015);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var2 = qim0Var;
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            hr80.d(qim0Var2, 1.0f, cbx.a(x340Var).a.b.a(), x340Var, i3 & 14, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0((byte) 0, i, i2, qim0Var);
        }
    }

    public static final void c(ArrayList arrayList, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1938906344);
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-1235625443);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j6p1.c(((v081) it.next()).b, x340Var, 0);
            }
            x340Var.r(false);
            b(0, 1, x340Var, null);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc0(arrayList, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(yv31 yv31Var, List list, Function0 function0, qim0 qim0Var, eq50 eq50Var, vu30 vu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        x081 x081Var;
        Object next;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1853863612);
        int i2 = (i & 6) == 0 ? (b0kVar3.g(yv31Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i((Object) null) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? b0kVar3.g(eq50Var) : b0kVar3.i(eq50Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            List list2 = list;
            Iterator it = list2.iterator();
            do {
                boolean zHasNext = it.hasNext();
                x081Var = x081.a;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((v081) next).a != x081Var);
            v081 v081Var = (v081) next;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((v081) obj).a != x081Var) {
                    arrayList.add(obj);
                }
            }
            boolean zEquals = eq50Var.equals(cq50.a);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("active-device-card", qim0Var3), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            b0kVar2 = b0kVar3;
            a(((i4 << 3) & 7168) | 24582, 2, function0, apo.r(-1845042370, new ey((Object) v081Var, (Object) eq50Var, zEquals, (Object) yv31Var, (Object) vu30Var, (byte) 2), b0kVar3), b0kVar2, anm1.N("active-device-context-list-row", qim0Var3), false, !zEquals);
            if (arrayList.isEmpty()) {
                b0kVar2.i0(1720699700);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1720643962);
                c(arrayList, null, b0kVar2, 0);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(yv31Var, list, function0, qim0Var2, eq50Var, vu30Var, i, (byte) 0);
        }
    }

    public static final void e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, qim0 qim0Var, b0k b0kVar, int i) {
        String str10;
        String str11;
        String str12;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(230275095);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.g(str4) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            str10 = str5;
            i2 |= b0kVar3.g(str10) ? 16384 : 8192;
        } else {
            str10 = str5;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(str6) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str11 = str7;
            i2 |= b0kVar3.g(str11) ? 1048576 : 524288;
        } else {
            str11 = str7;
        }
        if ((12582912 & i) == 0) {
            str12 = str8;
            i2 |= b0kVar3.g(str12) ? 8388608 : 4194304;
        } else {
            str12 = str8;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.g(str9) ? 67108864 : 33554432;
        }
        int i3 = i2 | (b0kVar3.i(qim0Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarF, cbx.d(b0kVar3).n, d9p1.o(str3, b0kVar3, (i3 >> 6) & 14), new a0e1(5), null, 2, false, cjc0Var, 0, null, b0kVar3, i3 & 14, 0, 1696);
            b0kVar2 = b0kVar3;
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).n, d9p1.o(str4, b0kVar2, (i3 >> 9) & 14), new a0e1(5), null, 2, false, new cjc0(1), 0, null, b0kVar3, (i3 >> 3) & 14, 0, 1696);
            pbh pbhVar = pbh.a;
            op71.g(b0kVar2, pbhVar.a(1.2f, nim0Var, true));
            int i4 = i3 >> 15;
            int i5 = ((i3 >> 12) & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168);
            f(str10, str11, str12, str9, u291.f(nim0Var, 1.0f), b0kVar2, i5);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, pbhVar.a(1.0f, u291.j(8.0f, 0.0f, 2, nim0Var), true));
            d9p1.c(i4 & 14, str6, b0kVar2, u291.f(nim0Var, 1.0f));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new is9((Object) str, (Object) str2, (Object) str3, (Object) str4, (Object) str5, (Object) str6, (Object) str7, (Object) str8, (Object) str9, qim0Var, i, (byte) 3);
        }
    }

    public static final void f(String str, String str2, String str3, String str4, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-171610714);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= x340Var.g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            int i3 = i2;
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, null, cbx.d(x340Var).p, cbx.a(x340Var).b.a, new a0e1(5), null, 2, false, cjc0Var, 0, null, x340Var, (i3 >> 3) & 14, 0, 1698);
            uwo1.e(str, null, cbx.d(x340Var).o, cbx.a(x340Var).b.a, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, i3 & 14, 0, 1698);
            String str6 = str5;
            uwo1.e(str6, null, cbx.d(x340Var).o, cbx.a(x340Var).b.a, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, (i3 >> 6) & 14, 0, 1698);
            x340Var = x340Var;
            x340Var.r(true);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.v(nim0Var, 2.0f));
            qim0 qim0VarQ = i1p1.q(nim0Var, er31.a);
            eso1.e(Uri.parse(str4), isl.a, qim0VarQ, new p3v(28.0f), (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 221232, 0, 3968);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yx(str, str2, str3, str4, qim0Var, i, (byte) 2);
        }
    }

    public static final void g(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        String str3;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1066161997);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (4.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarC = u291.c(new wnb0(4.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 4.0f, true), 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarC, er31.d(8.0f, 0.0f, 0.0f, 0.0f, 14));
            Uri uri = Uri.parse(str3);
            as80 as80Var = mif1.P0;
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 24624, 0, 4008);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarC2 = u291.c(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            cua cuaVar2 = cbx.b(x340Var2).f;
            eso1.e(Uri.parse(str2), islVar, i1p1.q(qim0VarC2, er31.d(0.0f, 8.0f, 0.0f, 0.0f, 13)), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 221232, 0, 3976);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a4f(str, str2, qim0Var, i, (byte) 3);
        }
    }

    public static final void h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-929048820);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.g(str5) ? 16384 : 8192) | (x340Var.g(str6) ? 131072 : 65536) | (x340Var.g(str7) ? 1048576 : 524288) | (x340Var.g(str8) ? 8388608 : 4194304) | (x340Var.g(str9) ? 67108864 : 33554432) | (x340Var.g(str10) ? 536870912 : 268435456);
        int i3 = (x340Var.g(str11) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g((i2 >> 12) & 126, str5, str6, x340Var, u291.c(qim0Var3, 0.44f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            int i4 = i2 & 8190;
            int i5 = i2 >> 6;
            e(str, str2, str3, str4, str7, str8, str9, str10, str11, u291.c(uyn1.y(qim0Var3, 8.0f, 12.0f), 1.0f), x340Var, (i5 & 29360128) | i4 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i3 << 24) & 234881024));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8z(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, qim0Var2, i);
        }
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    public static final void i(yv31 yv31Var, vu30 vu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var;
        boolean z;
        qim0 qim0Var2;
        ?? r15;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-937220453);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(yv31Var) ? 4 : 2) | (b0kVar3.i((Object) null) ? 32 : 16) | (b0kVar3.i(vu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar3, 48);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0Var3);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            float f = Float.MAX_VALUE;
            if (1.0f <= Float.MAX_VALUE) {
                f = 1.0f;
            }
            wnb0 wnb0Var = new wnb0(f, true);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, b0kVar3, 48);
            int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM3 = b0kVar3.m();
            qim0 qim0VarE3 = zr7.E(b0kVar3, wnb0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM3, b0kVar3, lljVar2);
            x0d.q(iHashCode3, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE3, b0kVar3, lljVar4);
            tzd1 tzd1Var = yv31Var.b;
            erc1 erc1Var = yv31Var.i;
            ArrayList arrayList = yv31Var.e;
            String str = tzd1Var.a;
            lee1 lee1Var = cbx.d(b0kVar3).d;
            long j = cbx.a(b0kVar3).b.a;
            cjc0 cjc0Var = new cjc0(1);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            uwo1.e(str, new wnb0(1.0f > f ? Float.MAX_VALUE : 1.0f, false), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, b0kVar3, 1572864, 0, 1712);
            if (!arrayList.isEmpty()) {
                b0kVar3.i0(957740812);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                qim0Var = qim0Var3;
                op71.g(b0kVar3, u291.v(qim0Var, 8.0f));
                z = false;
                iqo1.k(arrayList, null, b0kVar3, 0);
                b0kVar3.r(false);
            } else {
                qim0Var = qim0Var3;
                z = false;
                b0kVar3.i0(957887845);
                b0kVar3.r(false);
            }
            bcm bcmVar = yv31Var.d;
            acm acmVar = bcmVar instanceof acm ? (acm) bcmVar : null;
            if (acmVar != null) {
                b0kVar3.i0(958016247);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                op71.g(b0kVar3, u291.v(qim0Var, 4.0f));
                b0kVar3.i0(958225435);
                hux huxVar = acmVar.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                qim0 qim0VarN = anm1.N("active-device-context-menu-indicator", u291.r(qim0Var, 16.0f));
                long j2 = cbx.a(b0kVar3).b.b;
                b0kVar2 = b0kVar3;
                boolean z3 = z;
                qim0Var2 = qim0Var;
                w0h1.a(huxVar, isl.a, qim0VarN, j2, 0L, false, b0kVar2, 56, 48);
                b0kVar2.r(z3);
                b0kVar2.r(z3);
                r15 = z3;
            } else {
                qim0Var2 = qim0Var;
                b0kVar2 = b0kVar3;
                boolean z4 = z;
                b0kVar2.i0(958613989);
                b0kVar2.r(z4);
                r15 = z4;
            }
            b0kVar2.r(true);
            if (vu30Var != null) {
                b0kVar2.i0(1146933543);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(qim0Var2, 8.0f));
                us71.j((i2 >> 6) & 14, vu30Var, b0kVar2, (boolean) r15);
            } else {
                b0kVar2.i0(1147050785);
                b0kVar2.r((boolean) r15);
            }
            b0kVar2.r(true);
            if (erc1Var != null) {
                b0kVar2.i0(1995471567);
                n8p1.h(erc1Var, null, b0kVar2, r15);
                b0kVar2.r((boolean) r15);
            } else {
                b0kVar2.i0(1995546525);
                b0kVar2.r((boolean) r15);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(yv31Var, vu30Var, i, (byte) 7);
        }
    }

    public static final void j(yv31 yv31Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-885789288);
        int i2 = (x340Var.g(yv31Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            hux huxVar = yv31Var.c.a;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, anm1.N("active-device-icon", u291.r(nim0.a, 48.0f)), cbx.a(x340Var).c.c, 0L, false, x340Var, 56, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ab(yv31Var, i, (byte) 9);
        }
    }

    public static final void k(zzg zzgVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-578558092);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(zzgVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String str = zzgVar.k;
            String str2 = zzgVar.m;
            String str3 = zzgVar.n;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            int i4 = i3 << 6;
            qim0 qim0Var3 = nim0.a;
            d9p1.e(str, str2, str3, function0, qim0Var3, 8.0f, apo.r(174333112, new k2d0(zzgVar, (byte) 10), x340Var), x340Var, (i4 & 7168) | 1572864 | (i4 & 57344), 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(zzgVar, function0, qim0Var2, i, (byte) 27);
        }
    }

    public static final void l(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-421139953);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131960983);
            float f = 8.0f * ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).fontScale;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var2, f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, cbx.a(x340Var).c.g, er31.a);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new q4z0(strO0, (byte) 17);
                x340Var.s0(objT);
            }
            t1c.a(s161.b(qim0VarF, false, (iu30) objT), x340Var, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 12);
        }
    }

    public static void m(String str, ArrayList arrayList, String str2, Object obj) {
        if (obj == null) {
            return;
        }
        arrayList.add(str2 + " " + str + " " + obj);
    }

    public static final hcx n(float f, b0k b0kVar) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(460216820);
        d7 d7Var = new d7(hcx.i, (byte) 0);
        hcx hcxVar = hcx.a;
        while (d7Var.hasNext()) {
            hcx hcxVar2 = (hcx) d7Var.next();
            if (p3v.b(hcxVar2.a(x340Var), f) <= 0) {
                x340Var.i0(460219144);
                z = p3v.b(hcxVar2.a(x340Var), hcxVar.a(x340Var)) >= 0;
                x340Var.r(false);
            } else {
                x340Var.i0(1381892813);
                x340Var.r(false);
                z = false;
            }
            if (z) {
                hcxVar = hcxVar2;
            }
        }
        x340Var.r(false);
        return hcxVar;
    }

    public static k9k o(g0f0 g0f0Var, k1f0 k1f0Var) {
        g0f0Var.getClass();
        k1f0Var.getClass();
        return new k9k(g0f0Var, k1f0Var);
    }

    public static final int p(long j) {
        return (int) (j & 4294967295L);
    }

    public static final Long q(yo60 yo60Var, boolean z) {
        if (z || yo60Var.d.b.p() == 0) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(yo60Var.d.b.p()));
    }

    public static final int r(long j) {
        return (int) (j >> 32);
    }

    public static boolean s(String str, String str2) {
        return u890.j(str, str2) || nhc1.Y(str, str2.concat("?"), false);
    }

    public static boolean t(String str) {
        return s(str, "spotify:agent:fullchat") || s(str, "spotify:internal:martini");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.mlkit.common.MlKitException */
    public static Bitmap u(ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] bArrArray;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArrArray = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            byte[] bArr = new byte[iLimit];
            byteBuffer.get(bArr, 0, iLimit);
            bArrArray = bArr;
        }
        byte[] bArrB = B(i, bArrArray, i2);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
        return A(bitmapDecodeByteArray, i3, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public static final EsPlayOptions.PlayOptions v(PlayOptions playOptions) {
        ypz ypzVar;
        xpz xpzVar;
        wpz wpzVarO = EsPlayOptions.PlayOptions.o();
        if (playOptions.operation().c()) {
            PlayOperation playOperation = (PlayOperation) playOptions.operation().b();
            int i = playOperation == null ? -1 : pot0.a[playOperation.ordinal()];
            if (i == -1 || i == 1) {
                xpzVar = xpz.b;
            } else if (i == 2) {
                xpzVar = xpz.c;
            } else {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                xpzVar = xpz.d;
            }
            wpzVarO.n(xpzVar);
        }
        if (playOptions.trigger().c()) {
            PlayTrigger playTrigger = (PlayTrigger) playOptions.trigger().b();
            int i2 = playTrigger == null ? -1 : pot0.b[playTrigger.ordinal()];
            if (i2 == -1 || i2 == 1) {
                ypzVar = ypz.b;
            } else if (i2 == 2) {
                ypzVar = ypz.c;
            } else {
                if (i2 != 3) {
                    eg.o();
                    return null;
                }
                ypzVar = ypz.d;
            }
            wpzVarO.r(ypzVar);
        }
        return wpzVarO.build();
    }

    public static Object w(pd71 pd71Var, String str, List list, onm onmVar) {
        List<w4i1> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (w4i1 w4i1Var : list2) {
            arrayList.add(new z4i1(w4i1Var.e, w4i1Var.a));
        }
        o7h.p1(arrayList);
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w4i1) it.next()).a);
        }
        p7h.M(new h1p1[]{new fd71(arrayList2), dd71.c});
        return pd71Var.a(str, onmVar);
    }

    public static final Object x(pd71 pd71Var, String str, onm onmVar) {
        p7h.M(new h1p1[]{dd71.c, ed71.c});
        return pd71Var.a(str, onmVar);
    }

    public static final xvj y() {
        return new xvj(mmj.b, (j2i) null, (j2i) null, false, 62);
    }

    public static final String z(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath(ihc1.Y0(str, '?'));
        List listP0 = ihc1.P0(ihc1.T0(str, '?', ""), new char[]{'&'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            String str3 = (String) obj;
            if (str3.length() != 0 && !ihc1.Y0(str3, '=').equals("pt")) {
                arrayList.add(obj);
            }
        }
        String strY0 = o7h.y0(arrayList, "&", (String) null, (String) null, (iu30) null, 62);
        if (strY0.length() == 0) {
            strY0 = null;
        }
        String string = builderEncodedPath.encodedQuery(strY0).appendQueryParameter("pt", str2).build().toString();
        string.getClass();
        return string;
    }
}
