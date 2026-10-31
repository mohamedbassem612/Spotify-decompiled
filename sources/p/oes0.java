package p;

import android.graphics.pdf.PdfRenderer;
import android.graphics.pdf.PdfRendererPreV;
import android.graphics.pdf.content.PdfPageTextContent;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oes0 {
    public static nes0 b(ParcelFileDescriptor parcelFileDescriptor) {
        PdfRendererPreV pdfRendererPreV = new PdfRendererPreV(parcelFileDescriptor);
        try {
            lr80 it = yoi1.Q(0, pdfRendererPreV.getPageCount()).iterator();
            int i = 0;
            while (((sr80) it).c) {
                PdfRendererPreV.Page pageOpenPage = pdfRendererPreV.openPage(it.nextInt());
                try {
                    Iterator it2 = pageOpenPage.getTextContents().iterator();
                    int length = 0;
                    while (it2.hasNext()) {
                        length += ((PdfPageTextContent) it2.next()).getText().length();
                    }
                    o0c.v(pageOpenPage, (Throwable) null);
                    i += length;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        o0c.v(pageOpenPage, th);
                        throw th2;
                    }
                }
            }
            nes0 nes0Var = new nes0(Integer.valueOf(pdfRendererPreV.getPageCount()), Integer.valueOf(i));
            o0c.v(pdfRendererPreV, (Throwable) null);
            return nes0Var;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                o0c.v(pdfRendererPreV, th3);
                throw th4;
            }
        }
    }

    public final nes0 a(File file) {
        nes0 nes0VarB;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            try {
                if (Build.VERSION.SDK_INT < 31 || SdkExtensions.getExtensionVersion(31) < 13) {
                    PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                    try {
                        nes0 nes0Var = new nes0(Integer.valueOf(pdfRenderer.getPageCount()), 2);
                        o0c.v(pdfRenderer, (Throwable) null);
                        nes0VarB = nes0Var;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            o0c.v(pdfRenderer, th);
                            throw th2;
                        }
                    }
                } else {
                    parcelFileDescriptorOpen.getClass();
                    nes0VarB = b(parcelFileDescriptorOpen);
                }
                u890.p(parcelFileDescriptorOpen, (Throwable) null);
                return nes0VarB;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    u890.p(parcelFileDescriptorOpen, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            Logger.l(e, l1d.m("PdfMetadataReader: could not read ", file.getName()), new Object[0]);
            return new nes0((Integer) null, 3);
        }
    }
}
