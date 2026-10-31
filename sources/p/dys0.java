package p;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.profile.editprofile.imageutils.CroppingImageView;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dys0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PictureSelectionActivity b;

    public /* synthetic */ dys0(PictureSelectionActivity pictureSelectionActivity, byte b) {
        this.a = b;
        this.b = pictureSelectionActivity;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.app.Activity, com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Uri uriS = null;
        b7x b7xVar = b7x.a;
        int i = 1;
        ?? r8 = this.b;
        switch (b) {
            case 0:
                r8.setResult(0);
                r0w r0wVarP0 = r8.p0();
                i8h1 i8h1Var = r0wVarP0.a;
                x6h1 x6h1VarC = r0wVarP0.b.b.c();
                x6h1VarC.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                r8.finish();
                return;
            case 1:
                r0w r0wVarP1 = r8.p0();
                i8h1 i8h1Var2 = r0wVarP1.a;
                x6h1 x6h1VarC3 = r0wVarP1.b.b.c();
                x6h1VarC3.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("retake_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                r8.s0(false);
                r8.r0();
                return;
            default:
                r0w r0wVarP2 = r8.p0();
                i8h1 i8h1Var3 = r0wVarP2.a;
                x6h1 x6h1VarC5 = r0wVarP2.b.b.c();
                x6h1VarC5.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("use_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                String str3 = i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                Intent intent = new Intent();
                CroppingImageView croppingImageView = r8.l1;
                croppingImageView.getClass();
                RectF normalizedRect = croppingImageView.getNormalizedRect();
                st60 st60Var = r8.i1;
                if (st60Var == null) {
                    u890.C("imageFileHelper");
                    throw null;
                }
                Uri uri = r8.r1;
                uri.getClass();
                dg30 dg30Var = (dg30) st60Var.d;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    InputStream inputStreamOpenInputStream = dg30Var.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        inputStreamOpenInputStream.close();
                        InputStream inputStreamOpenInputStream2 = dg30Var.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream2 != null) {
                            sm00 sm00Var = new sm00(inputStreamOpenInputStream2);
                            inputStreamOpenInputStream2.close();
                            int i2 = sm00Var.i(1, "Orientation");
                            RectF rectFC = g2p1.C(normalizedRect, i2);
                            int i3 = options.outWidth;
                            int i4 = options.outHeight;
                            float f = i3;
                            int iU = jch0.U(rectFC.left * f);
                            float f2 = i4;
                            int iU2 = jch0.U(rectFC.top * f2);
                            int iMin = Math.min(jch0.U(rectFC.width() * f), jch0.U(rectFC.height() * f2));
                            Rect rect = new Rect(iU, iU2, iU + iMin, iMin + iU2);
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            while ((rect.height() / i) * (rect.width() / i) >= 9000000) {
                                i *= 2;
                                break;
                            }
                            options2.inSampleSize = i;
                            InputStream inputStreamOpenInputStream3 = dg30Var.getContentResolver().openInputStream(uri);
                            if (inputStreamOpenInputStream3 != null) {
                                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream3, false);
                                Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance != null ? bitmapRegionDecoderNewInstance.decodeRegion(rect, options2) : null;
                                inputStreamOpenInputStream3.close();
                                if (bitmapDecodeRegion != null) {
                                    int width = bitmapDecodeRegion.getWidth();
                                    int height = bitmapDecodeRegion.getHeight();
                                    Matrix matrix = new Matrix();
                                    g2p1.J(matrix, i2);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, width, height, matrix, true);
                                    uriS = st60Var.s(bitmapCreateBitmap);
                                    bitmapDecodeRegion.recycle();
                                    bitmapCreateBitmap.recycle();
                                    break;
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    Logger.e(e, "Failed to create profile image", new Object[0]);
                }
                if (uriS == null) {
                    r8.setResult(100);
                } else {
                    intent.setData(uriS);
                    r8.setResult(-1, intent);
                }
                r8.finish();
                return;
        }
    }
}
