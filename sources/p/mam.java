package p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mam implements l120 {
    public final j2i1 a;
    public final dqq0 b;

    public mam(j2i1 j2i1Var, dqq0 dqq0Var) {
        this.a = j2i1Var;
        this.b = dqq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    public final Object a(lnm lnmVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listZ;
        int size;
        Bundle bundle;
        j2i1 j2i1Var = this.a;
        Uri uri = Uri.parse(j2i1Var.a);
        dqq0 dqq0Var = this.b;
        ContentResolver contentResolver = dqq0Var.a.getContentResolver();
        String str = j2i1Var.d;
        if (u890.j(str, "com.android.contacts") && u890.j(o7h.C0(jch0.z(j2i1Var)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                jah.h("Unable to find a contact photo associated with '", uri, "'.");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && u890.j(str, "media") && (size = (listZ = jch0.z(j2i1Var)).size()) >= 3 && u890.j(listZ.get(size - 3), "audio") && u890.j(listZ.get(size - 2), "albums")) {
            k291 k291Var = dqq0Var.b;
            w4u w4uVar = k291Var.a;
            w4u w4uVar2 = w4uVar instanceof w4u ? w4uVar : null;
            if (w4uVar2 != null) {
                int i = w4uVar2.a;
                w4u w4uVar3 = k291Var.b;
                w4u w4uVar4 = w4uVar3 instanceof w4u ? w4uVar3 : null;
                if (w4uVar4 != null) {
                    int i2 = w4uVar4.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                jah.h("Unable to find a music thumbnail associated with '", uri, "'.");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                jah.h("Unable to open '", uri, "'.");
                return null;
            }
        }
        return new oka1(new qka1(new ff01(si1.v(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), dqq0Var.f, new dyl(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), 3);
    }
}
