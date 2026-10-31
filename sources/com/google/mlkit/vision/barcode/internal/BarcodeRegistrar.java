package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p.ccm1;
import p.ewn1;
import p.hzh;
import p.im00;
import p.mio1;
import p.qbo1;
import p.qen1;
import p.qok0;
import p.vzh;
import p.wct;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        hzh hzhVarA = vzh.a(mio1.class);
        hzhVarA.a(wct.a(qok0.class));
        hzhVarA.f = new qen1();
        vzh vzhVarB = hzhVarA.b();
        hzh hzhVarA2 = vzh.a(qbo1.class);
        hzhVarA2.a(wct.a(mio1.class));
        hzhVarA2.a(wct.a(im00.class));
        hzhVarA2.a(wct.a(qok0.class));
        hzhVarA2.f = new ccm1();
        return ewn1.i(vzhVarB, hzhVarA2.b());
    }
}
