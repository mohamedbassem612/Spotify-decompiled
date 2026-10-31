package p;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import app.p000rive.semantics.SemanticState;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gxa extends nw81 {
    public final Context n;
    public final int o;

    public gxa(Context context) {
        super(new gar[1], new exa[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // p.nw81
    public final har g() {
        return new exa(this);
    }

    @Override // p.nw81
    public final DecoderException i(gar garVar, har harVar, boolean z) {
        exa exaVar = (exa) harVar;
        ByteBuffer byteBuffer = garVar.d;
        byteBuffer.getClass();
        dm5.y(byteBuffer.hasArray());
        dm5.m(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointC = zoi1.C(context);
                    int i = pointC.x;
                    int i2 = pointC.y;
                    ie30 ie30Var = garVar.b;
                    if (ie30Var != null) {
                        int i3 = ie30Var.R;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = ie30Var.S;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = SemanticState.Obscured;
                }
            }
            exaVar.d = mb4.h(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            exaVar.b = garVar.f;
            return null;
        } catch (IOException e) {
            return new ImageDecoderException(e);
        } catch (ParserException e2) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e2);
        }
    }
}
